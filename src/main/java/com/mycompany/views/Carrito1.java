package com.mycompany.views;


import com.mycompany.uidepets.SessionManager;
import com.mycompany.uidepets.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Carrito1 extends javax.swing.JPanel {
    private DefaultTableModel modeloTabla;
    private double subtotal = 0.0;
    private final double IVA_PORCENTAJE = 0.12;
    private final DecimalFormat df = new DecimalFormat("#.##");
    private int carroId = -1;
    
    public Carrito1() {
        initComponents();
        InitStyles();
        inicializarTabla();
        obtenerCarroActivo();
        cargarProductosDelCarro();
    }
    private void obtenerCarroActivo() {
        if (!SessionManager.isLoggedIn()) {
            JOptionPane.showMessageDialog(this, "Debe iniciar sesión para ver el carrito", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try (Connection conn = Conexion.establecerConexion()) {
            String sql = "SELECT Carro_ID FROM CARRO WHERE Usuario_Id = ? AND Estado = 'ACTIVO'";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, SessionManager.getCurrentUserId());
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                carroId = rs.getInt("Carro_ID");
            } else {
                String sqlInsert = "INSERT INTO CARRO (Usuario_Id) VALUES (?)";
                PreparedStatement stmtInsert = conn.prepareStatement(sqlInsert, PreparedStatement.RETURN_GENERATED_KEYS);
                stmtInsert.setInt(1, SessionManager.getCurrentUserId());
                stmtInsert.executeUpdate();
                
                ResultSet generatedKeys = stmtInsert.getGeneratedKeys();
                if (generatedKeys.next()) {
                    carroId = generatedKeys.getInt(1);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al obtener carrito: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cargarProductosDelCarro() {
        if (carroId == -1) return;
        
        modeloTabla.setRowCount(0);
        subtotal = 0.0;
        
        try (Connection conn = Conexion.establecerConexion()) {
            String sql = "SELECT dc.Detalle_ID, p.Producto_ID, p.Nombre_Producto, p.Precio, dc.Cantidad, "
                       + "(p.Precio * dc.Cantidad) AS Subtotal "
                       + "FROM DETALLE_CARRO dc "
                       + "JOIN PRODUCTOS p ON dc.Producto_ID = p.Producto_ID "
                       + "WHERE dc.Carro_ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, carroId);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                int detalleId = rs.getInt("Detalle_ID");
                String nombre = rs.getString("Nombre_Producto");
                double precio = rs.getDouble("Precio");
                int cantidad = rs.getInt("Cantidad");
                double subtotalFila = rs.getDouble("Subtotal");
                
                Object[] fila = {
                    detalleId,
                    nombre,
                    df.format(precio),
                    String.valueOf(cantidad),
                    df.format(subtotalFila),
                    false
                };
                modeloTabla.addRow(fila);
                subtotal += subtotalFila;
            }
            
            actualizarTotales();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar productos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void inicializarTabla() {
        modeloTabla = new DefaultTableModel(
            new Object [][] {},
            new String [] {"ID", "Producto", "Precio", "Cantidad", "Subtotal", "Eliminar"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 3 || column == 5;
            }
            
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 5) {
                    return Boolean.class;
                }
                return String.class;
            }
        };
        
        jTable1.setModel(modeloTabla);
        

        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        
        jTable1.getModel().addTableModelListener(e -> {
            if (e.getColumn() == 3) {
                actualizarCantidadEnBD(e.getFirstRow());
            } else if (e.getColumn() == 5) {
                if ((Boolean)jTable1.getValueAt(e.getFirstRow(), 5)) {
                    eliminarProductoDeBD(e.getFirstRow());
                }
            }
        });
    }
    
public void agregarProductoAlCarro(int productoId) {
    if (!SessionManager.isLoggedIn()) {
        JOptionPane.showMessageDialog(this, "Debe iniciar sesión para agregar productos al carrito", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    if (carroId == -1) {
        obtenerCarroActivo();
        if (carroId == -1) return;
    }
    
    try (Connection conn = Conexion.establecerConexion()) {
        // Verificar si el producto ya está en el carro
        String sqlVerificar = "SELECT dc.Detalle_ID, dc.Cantidad, p.Precio, p.Nombre_Producto "
                           + "FROM DETALLE_CARRO dc "
                           + "JOIN PRODUCTOS p ON dc.Producto_ID = p.Producto_ID "
                           + "WHERE dc.Carro_ID = ? AND dc.Producto_ID = ?";
        PreparedStatement stmtVerificar = conn.prepareStatement(sqlVerificar);
        stmtVerificar.setInt(1, carroId);
        stmtVerificar.setInt(2, productoId);
        
        ResultSet rs = stmtVerificar.executeQuery();
        
        if (rs.next()) {
            // Si el producto ya existe, actualizar cantidad
            int detalleId = rs.getInt("Detalle_ID");
            int cantidad = rs.getInt("Cantidad") + 1;
            double precio = rs.getDouble("Precio");
            
            String sqlActualizar = "UPDATE DETALLE_CARRO SET Cantidad = ?, Subtotal = ? * ? WHERE Detalle_ID = ?";
            PreparedStatement stmtActualizar = conn.prepareStatement(sqlActualizar);
            stmtActualizar.setInt(1, cantidad);
            stmtActualizar.setDouble(2, precio);
            stmtActualizar.setInt(3, cantidad);
            stmtActualizar.setInt(4, detalleId);
            stmtActualizar.executeUpdate();
        } else {
            // Obtener información del producto
            String sqlProducto = "SELECT Nombre_Producto, Precio FROM PRODUCTOS WHERE Producto_ID = ?";
            PreparedStatement stmtProducto = conn.prepareStatement(sqlProducto);
            stmtProducto.setInt(1, productoId);
            
            ResultSet rsProducto = stmtProducto.executeQuery();
            if (rsProducto.next()) {
                String nombre = rsProducto.getString("Nombre_Producto");
                double precio = rsProducto.getDouble("Precio");
                
                String sqlInsertar = "INSERT INTO DETALLE_CARRO (Carro_ID, Producto_ID, Precio, Nombre_Producto, Cantidad, Subtotal) "
                                  + "VALUES (?, ?, ?, ?, 1, ?)";
                PreparedStatement stmtInsertar = conn.prepareStatement(sqlInsertar);
                stmtInsertar.setInt(1, carroId);
                stmtInsertar.setInt(2, productoId);
                stmtInsertar.setDouble(3, precio);
                stmtInsertar.setString(4, nombre);
                stmtInsertar.setDouble(5, precio);
                stmtInsertar.executeUpdate();
            }
        }
        
        // Actualizar la vista del carrito
        cargarProductosDelCarro();
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al agregar producto al carrito: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void actualizarCantidadEnBD(int fila) {
        if (carroId == -1) return;
        
        try {
            int detalleId = (int) jTable1.getValueAt(fila, 0);
            int cantidad = Integer.parseInt(jTable1.getValueAt(fila, 3).toString());
            
            try (Connection conn = Conexion.establecerConexion()) {
                String sql = "UPDATE DETALLE_CARRO SET Cantidad = ?, Subtotal = Precio * ? WHERE Detalle_ID = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1, cantidad);
                stmt.setInt(2, cantidad);
                stmt.setInt(3, detalleId);
                stmt.executeUpdate();
            }
        } catch (NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar cantidad: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void eliminarProductoDeBD(int fila) {
        if (carroId == -1) return;
        
        int detalleId = (int) jTable1.getValueAt(fila, 0);
        
        try (Connection conn = Conexion.establecerConexion()) {
            String sql = "DELETE FROM DETALLE_CARRO WHERE Detalle_ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, detalleId);
            stmt.executeUpdate();
            
            cargarProductosDelCarro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar producto: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void actualizarTotales() {
        Subtotal.setText("Subtotal: $" + df.format(subtotal));
        double iva = subtotal * IVA_PORCENTAJE;
        IVA.setText("IVA (12%): $" + df.format(iva));
        Total.setText("Total: $" + df.format(subtotal + iva));
    }

    private void InitStyles() {
        
        //Titulos de las Marcas de comidas de Perro-------------
        Bienvenida.putClientProperty( "FlatLaf.styleClass", "h1" );
        Despedida.putClientProperty( "FlatLaf.styleClass", "h2" );
        Despedida1.putClientProperty( "FlatLaf.styleClass", "h2" );
        Despedida2.putClientProperty( "FlatLaf.styleClass", "h2" );
        //--------------------------------------------------------
        Bienvenida.setForeground(Color.black);
        Despedida.setForeground(Color.black);
        Despedida1.setForeground(Color.black);
        Despedida2.setForeground(Color.black);
    }

    // Resto del código generado por NetBeans...
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Bienvenida = new javax.swing.JLabel();
        Subtotal = new javax.swing.JLabel();
        IVA = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        Pagar = new javax.swing.JButton();
        Despedida = new javax.swing.JLabel();
        Despedida1 = new javax.swing.JLabel();
        Despedida2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Cantidad ", "Subtotal", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setDropMode(javax.swing.DropMode.INSERT);
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable1.setShowGrid(true);
        jScrollPane2.setViewportView(jTable1);

        Bienvenida.setText("Bienvenido al Carrito");

        Subtotal.setText("Subtotal: 81.76");

        IVA.setText("IVA (12%) : 9.80");

        Total.setText("Total: 91.56");

        Pagar.setText("Pagar ");
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });

        Despedida.setText("Esperamos");

        Despedida1.setText("Verte ");

        Despedida2.setText("De nuevo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IVA, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Bienvenida))
                            .addComponent(Pagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Despedida)
                    .addComponent(Despedida2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Despedida1)))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Bienvenida)
                .addGap(43, 43, 43)
                .addComponent(Subtotal)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Despedida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Despedida1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Despedida2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(IVA)
                        .addGap(36, 36, 36)
                        .addComponent(Total)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
         if (!SessionManager.isLoggedIn()) {
            JOptionPane.showMessageDialog(this, "Debe iniciar sesión para realizar el pago", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (modeloTabla.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "El carrito está vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try (Connection conn = Conexion.establecerConexion()) {
            String sqlActualizarCarro = "UPDATE CARRO SET Estado = 'PAGADO' WHERE Carro_ID = ?";
            PreparedStatement stmtActualizarCarro = conn.prepareStatement(sqlActualizarCarro);
            stmtActualizarCarro.setInt(1, carroId);
            stmtActualizarCarro.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Pago realizado con éxito. Gracias por su compra!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            modeloTabla.setRowCount(0);
            subtotal = 0.0;
            actualizarTotales();
            
            obtenerCarroActivo();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al procesar el pago: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_PagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JLabel Despedida;
    private javax.swing.JLabel Despedida1;
    private javax.swing.JLabel Despedida2;
    private javax.swing.JLabel IVA;
    private javax.swing.JButton Pagar;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JLabel Total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
