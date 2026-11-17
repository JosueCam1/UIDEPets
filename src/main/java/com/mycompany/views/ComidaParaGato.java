/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class ComidaParaGato extends javax.swing.JPanel {

    /**
     * Creates new form Procan
     */
    public ComidaParaGato() {
        initComponents();
        InitStyles();
    }
    private void InitStyles() {
        
        //Titulos de las Marcas de comidas de Perro-------------
        BuenCan.putClientProperty( "FlatLaf.styleClass", "h1" );
        BuenCan1.putClientProperty( "FlatLaf.styleClass", "h1" );
        BuenCan2.putClientProperty( "FlatLaf.styleClass", "h1" );
        BuenCan3.putClientProperty( "FlatLaf.styleClass", "h1" );
        //--------------------------------------------------------  
        DogChow.putClientProperty( "FlatLaf.styleClass", "h1" );
        DogChow1.putClientProperty( "FlatLaf.styleClass", "h1" );
        DogChow2.putClientProperty( "FlatLaf.styleClass", "h1" );
        DogChow3.putClientProperty( "FlatLaf.styleClass", "h1" );
        //-------------------------------------------------------- 
        ProCan.putClientProperty( "FlatLaf.styleClass", "h1" );
        ProCan1.putClientProperty( "FlatLaf.styleClass", "h1" );
        ProCan2.putClientProperty( "FlatLaf.styleClass", "h1" );
        ProCan3.putClientProperty( "FlatLaf.styleClass", "h1" );
        //--------------------------------------------------------
        BuenCan.setForeground(Color.black);
        BuenCan1.setForeground(Color.black);
        BuenCan2.setForeground(Color.black);
        BuenCan3.setForeground(Color.black);
        //--------------------------------------------------------
        DogChow.setForeground(Color.black);
        DogChow1.setForeground(Color.black);
        DogChow2.setForeground(Color.black);
        DogChow3.setForeground(Color.black);
        //--------------------------------------------------------
        ProCan.setForeground(Color.black);
        ProCan1.setForeground(Color.black);
        ProCan2.setForeground(Color.black);
        ProCan3.setForeground(Color.black);
       //Titulos de las Marcas de comidas de Perro-------------
       
       //Titulos de Cachorros/Adultos de comidas de Perro-------------
        Adultos.putClientProperty( "FlatLaf.styleClass", "h2" );
        Adultos1.putClientProperty( "FlatLaf.styleClass", "h2" );
        Adultos2.putClientProperty( "FlatLaf.styleClass", "h2" );
        Adultos3.putClientProperty( "FlatLaf.styleClass", "h2" );
        Adultos4.putClientProperty( "FlatLaf.styleClass", "h2" );
        Adultos5.putClientProperty( "FlatLaf.styleClass", "h2" );
        //------------------------------------------------------
        Cachorros.putClientProperty( "FlatLaf.styleClass", "h2" );
        Cachorros1.putClientProperty( "FlatLaf.styleClass", "h2" );
        Cachorros2.putClientProperty( "FlatLaf.styleClass", "h2" );
        Cachorros3.putClientProperty( "FlatLaf.styleClass", "h2" );
        Cachorros4.putClientProperty( "FlatLaf.styleClass", "h2" );
        Cachorros5.putClientProperty( "FlatLaf.styleClass", "h2" );
        //--------------------------------------------------------
        Adultos.setForeground(Color.black);
        Adultos1.setForeground(Color.black);
        Adultos2.setForeground(Color.black);
        Adultos3.setForeground(Color.black);
        Adultos4.setForeground(Color.black);
        Adultos5.setForeground(Color.black);
        //--------------------------------------------------------
        Cachorros.setForeground(Color.black);
        Cachorros1.setForeground(Color.black);
        Cachorros2.setForeground(Color.black);
        Cachorros3.setForeground(Color.black);
        Cachorros4.setForeground(Color.black);
        Cachorros5.setForeground(Color.black);
       //Titulos de Cachorros/Adultos de comidas de Perro------------- 
       
       //Titulos de Dinero /Peso de comidas de Perro-------------
        Peso.putClientProperty( "FlatLaf.styleClass", "h3" );
        Peso1.putClientProperty( "FlatLaf.styleClass", "h3" );
        Peso2.putClientProperty( "FlatLaf.styleClass", "h3" );
        Peso3.putClientProperty( "FlatLaf.styleClass", "h3" );
        Peso4.putClientProperty( "FlatLaf.styleClass", "h3" );
        Peso5.putClientProperty( "FlatLaf.styleClass", "h3" );
        Peso6.putClientProperty( "FlatLaf.styleClass", "h3" );
        Peso7.putClientProperty( "FlatLaf.styleClass", "h3" );
        Peso8.putClientProperty( "FlatLaf.styleClass", "h3" );
        Peso9.putClientProperty( "FlatLaf.styleClass", "h3" );
        Peso12.putClientProperty( "FlatLaf.styleClass", "h3" );
        Peso13.putClientProperty( "FlatLaf.styleClass", "h3" );
        //------------------------------------------------------
        Dinero.putClientProperty( "FlatLaf.styleClass", "h3" );
        Dinero1.putClientProperty( "FlatLaf.styleClass", "h3" );
        Dinero2.putClientProperty( "FlatLaf.styleClass", "h3" );
        Dinero3.putClientProperty( "FlatLaf.styleClass", "h3" );
        Dinero4.putClientProperty( "FlatLaf.styleClass", "h3" );
        Dinero5.putClientProperty( "FlatLaf.styleClass", "h3" );
        Dinero6.putClientProperty( "FlatLaf.styleClass", "h3" );
        Dinero7.putClientProperty( "FlatLaf.styleClass", "h3" );
        Dinero8.putClientProperty( "FlatLaf.styleClass", "h3" );
        Dinero9.putClientProperty( "FlatLaf.styleClass", "h3" );
        Dinero12.putClientProperty( "FlatLaf.styleClass", "h3" );
        Dinero13.putClientProperty( "FlatLaf.styleClass", "h3" );
        //------------------------------------------------------
        Dinero.setForeground(Color.black);
        Dinero1.setForeground(Color.black);
        Dinero2.setForeground(Color.black);
        Dinero3.setForeground(Color.black);
        Dinero4.setForeground(Color.black);
        Dinero5.setForeground(Color.black);
        Dinero6.setForeground(Color.black);
        Dinero7.setForeground(Color.black);
        Dinero8.setForeground(Color.black);
        Dinero9.setForeground(Color.black);
        Dinero12.setForeground(Color.black);
        Dinero13.setForeground(Color.black);
        //------------------------------------------------------
        Peso.setForeground(Color.black);
        Peso1.setForeground(Color.black);
        Peso2.setForeground(Color.black);
        Peso3.setForeground(Color.black);
        Peso4.setForeground(Color.black);
        Peso5.setForeground(Color.black);
        Peso6.setForeground(Color.black);
        Peso7.setForeground(Color.black);
        Peso8.setForeground(Color.black);
        Peso9.setForeground(Color.black);
        Peso12.setForeground(Color.black);
        Peso13.setForeground(Color.black);
       //Titulos de Dinero /Peso de comidas de Perro-------------
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Principal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Carrito = new javax.swing.JButton();
        Carrito1 = new javax.swing.JButton();
        Carrito2 = new javax.swing.JButton();
        Carrito3 = new javax.swing.JButton();
        Carrito4 = new javax.swing.JButton();
        Carrito5 = new javax.swing.JButton();
        Carrito6 = new javax.swing.JButton();
        Carrito7 = new javax.swing.JButton();
        Carrito8 = new javax.swing.JButton();
        Carrito9 = new javax.swing.JButton();
        Carrito10 = new javax.swing.JButton();
        Carrito11 = new javax.swing.JButton();
        Peso = new javax.swing.JLabel();
        Peso1 = new javax.swing.JLabel();
        Peso2 = new javax.swing.JLabel();
        Peso3 = new javax.swing.JLabel();
        Peso4 = new javax.swing.JLabel();
        Peso5 = new javax.swing.JLabel();
        Peso6 = new javax.swing.JLabel();
        Peso7 = new javax.swing.JLabel();
        Peso8 = new javax.swing.JLabel();
        Peso9 = new javax.swing.JLabel();
        BuenCan = new javax.swing.JLabel();
        BuenCan1 = new javax.swing.JLabel();
        BuenCan2 = new javax.swing.JLabel();
        BuenCan3 = new javax.swing.JLabel();
        DogChow = new javax.swing.JLabel();
        DogChow1 = new javax.swing.JLabel();
        DogChow2 = new javax.swing.JLabel();
        DogChow3 = new javax.swing.JLabel();
        ProCan = new javax.swing.JLabel();
        ProCan1 = new javax.swing.JLabel();
        ProCan2 = new javax.swing.JLabel();
        ProCan3 = new javax.swing.JLabel();
        Adultos = new javax.swing.JLabel();
        Adultos1 = new javax.swing.JLabel();
        Adultos2 = new javax.swing.JLabel();
        Adultos3 = new javax.swing.JLabel();
        Adultos4 = new javax.swing.JLabel();
        Adultos5 = new javax.swing.JLabel();
        Cachorros = new javax.swing.JLabel();
        Cachorros1 = new javax.swing.JLabel();
        Cachorros2 = new javax.swing.JLabel();
        Cachorros3 = new javax.swing.JLabel();
        Cachorros4 = new javax.swing.JLabel();
        Cachorros5 = new javax.swing.JLabel();
        Dinero1 = new javax.swing.JLabel();
        Dinero = new javax.swing.JLabel();
        Dinero2 = new javax.swing.JLabel();
        Dinero3 = new javax.swing.JLabel();
        Dinero4 = new javax.swing.JLabel();
        Dinero5 = new javax.swing.JLabel();
        Dinero7 = new javax.swing.JLabel();
        Dinero6 = new javax.swing.JLabel();
        Dinero8 = new javax.swing.JLabel();
        Dinero9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Peso12 = new javax.swing.JLabel();
        Dinero12 = new javax.swing.JLabel();
        Peso13 = new javax.swing.JLabel();
        Dinero13 = new javax.swing.JLabel();

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Principal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Comida Para Gato/Avantadulto.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Comida Para Gato/CatchowCachorro.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Comida Para Gato/Catchowadulto.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Comida Para Gato/Procatadulto.png.jpg"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Comida Para Gato/Procatcahorro.png"))); // NOI18N

        Carrito.setText("Agregar al Carrito");
        Carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarritoActionPerformed(evt);
            }
        });

        Carrito1.setText("Agregar al Carrito");
        Carrito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carrito1ActionPerformed(evt);
            }
        });

        Carrito2.setText("Agregar al Carrito");
        Carrito2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carrito2ActionPerformed(evt);
            }
        });

        Carrito3.setText("Agregar al Carrito");
        Carrito3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carrito3ActionPerformed(evt);
            }
        });

        Carrito4.setText("Agregar al Carrito");
        Carrito4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carrito4ActionPerformed(evt);
            }
        });

        Carrito5.setText("Agregar al Carrito");
        Carrito5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carrito5ActionPerformed(evt);
            }
        });

        Carrito6.setText("Agregar al Carrito");
        Carrito6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carrito6ActionPerformed(evt);
            }
        });

        Carrito7.setText("Agregar al Carrito");
        Carrito7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carrito7ActionPerformed(evt);
            }
        });

        Carrito8.setText("Agregar al Carrito");
        Carrito8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carrito8ActionPerformed(evt);
            }
        });

        Carrito9.setText("Agregar al Carrito");
        Carrito9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carrito9ActionPerformed(evt);
            }
        });

        Carrito10.setText("Agregar al Carrito");
        Carrito10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carrito10ActionPerformed(evt);
            }
        });

        Carrito11.setText("Agregar al Carrito");
        Carrito11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carrito11ActionPerformed(evt);
            }
        });

        Peso.setText("1,7 KG");

        Peso1.setText("85 G");

        Peso2.setText("85 G");

        Peso3.setText("1,7 KG");

        Peso4.setText("1,5 KG");

        Peso5.setText("500 G");

        Peso6.setText("1,5 KG");

        Peso7.setText("500 KG");

        Peso8.setText("2 KG");

        Peso9.setText("180 G");

        BuenCan.setText("CAT AVANT");

        BuenCan1.setText("CAT AVANT");

        BuenCan2.setText("CAT AVANT");

        BuenCan3.setText("CAT AVANT");

        DogChow.setText("Cat Chow ");

        DogChow1.setText("Cat Chow");

        DogChow2.setText("Cat Chow");

        DogChow3.setText("Cat Chow");

        ProCan.setText("Pro-Cat");

        ProCan1.setText("Pro-Cat ");

        ProCan2.setText("Pro-Cat");

        ProCan3.setText("Pro-Cat");

        Adultos.setText("Cachorros");

        Adultos1.setText("Cachorros");

        Adultos2.setText("Cachorros ");

        Adultos3.setText("Cachorros");

        Adultos4.setText("Cachorros");

        Adultos5.setText("Cachorros");

        Cachorros.setText("Adultos");

        Cachorros1.setText("Adultos");

        Cachorros2.setText("Adultos");

        Cachorros3.setText("Adultos");

        Cachorros4.setText("Adultos ");

        Cachorros5.setText("Adultos");

        Dinero1.setText("9 $");

        Dinero.setText("1,90 $");

        Dinero2.setText("30.70 $");

        Dinero3.setText("1,90 $");

        Dinero4.setText("12,08 $");

        Dinero5.setText("4,50 $");

        Dinero7.setText("4,50 $");

        Dinero6.setText("12,08 $");

        Dinero8.setText("8,70 $");

        Dinero9.setText("1,95 $");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Comida Para Gato/Avantcachorro.png"))); // NOI18N

        Peso12.setText("7 KG");

        Dinero12.setText("27,85 $");

        Peso13.setText("85 G");

        Dinero13.setText("1,90 $");

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5)))))
                .addGap(94, 94, 94)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DogChow2)
                            .addComponent(Cachorros3)
                            .addComponent(Peso6)
                            .addComponent(Dinero6)
                            .addComponent(Carrito6))
                        .addGap(70, 70, 70)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DogChow3)
                            .addComponent(Cachorros2)
                            .addComponent(Peso7)
                            .addComponent(Dinero7)
                            .addComponent(Carrito7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BuenCan2)
                                    .addComponent(Cachorros)
                                    .addComponent(Peso3)
                                    .addComponent(Dinero2)
                                    .addComponent(Carrito2))
                                .addGap(78, 78, 78)
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BuenCan3)
                                    .addComponent(Cachorros1)
                                    .addComponent(Peso2)
                                    .addComponent(Dinero3)
                                    .addComponent(Carrito3)))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BuenCan1)
                                    .addComponent(Adultos)
                                    .addComponent(Peso)
                                    .addComponent(Dinero1)
                                    .addComponent(Carrito1))
                                .addGap(56, 56, 56)
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Carrito)
                                    .addComponent(BuenCan)
                                    .addComponent(Adultos1)
                                    .addComponent(Peso1)
                                    .addComponent(Dinero)))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Adultos2)
                                    .addComponent(Peso4)
                                    .addComponent(Dinero4)
                                    .addComponent(Carrito4)
                                    .addComponent(DogChow))
                                .addGap(78, 78, 78)
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DogChow1)
                                    .addComponent(Adultos3)
                                    .addComponent(Peso5)
                                    .addComponent(Dinero5)
                                    .addComponent(Carrito5)))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProCan)
                                    .addComponent(Cachorros4)
                                    .addComponent(Peso8)
                                    .addComponent(Dinero8)
                                    .addComponent(Carrito8)
                                    .addComponent(ProCan2)
                                    .addComponent(Adultos5)
                                    .addComponent(Carrito10))
                                .addGap(70, 70, 70)
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProCan3)
                                    .addComponent(Adultos4)
                                    .addComponent(Carrito11)
                                    .addComponent(ProCan1)
                                    .addComponent(Cachorros5)
                                    .addComponent(Peso9)
                                    .addComponent(Carrito9)
                                    .addComponent(Dinero9)))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Peso12)
                                    .addComponent(Dinero12))
                                .addGap(157, 157, 157)
                                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Peso13)
                                    .addComponent(Dinero13))))
                        .addGap(0, 34, Short.MAX_VALUE))))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addComponent(BuenCan)
                                .addGap(18, 18, 18)
                                .addComponent(Adultos1)
                                .addGap(18, 18, 18)
                                .addComponent(Peso1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Dinero)
                                .addGap(24, 24, 24)
                                .addComponent(Carrito))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addComponent(BuenCan1)
                                .addGap(18, 18, 18)
                                .addComponent(Adultos)
                                .addGap(18, 18, 18)
                                .addComponent(Peso)
                                .addGap(18, 18, 18)
                                .addComponent(Dinero1)
                                .addGap(18, 18, 18)
                                .addComponent(Carrito1)))
                        .addGap(116, 116, 116)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BuenCan2)
                            .addComponent(BuenCan3))
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cachorros1)
                            .addComponent(Cachorros))
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Peso3)
                            .addComponent(Peso2))
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dinero2)
                            .addComponent(Dinero3))
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Carrito2)
                            .addComponent(Carrito3))
                        .addGap(130, 130, 130)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                                .addComponent(DogChow1)
                                .addGap(18, 18, 18)
                                .addComponent(Adultos3)
                                .addGap(18, 18, 18)
                                .addComponent(Peso5)
                                .addGap(18, 18, 18)
                                .addComponent(Dinero5)
                                .addGap(18, 18, 18)
                                .addComponent(Carrito5))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addComponent(DogChow)
                                .addGap(18, 18, 18)
                                .addComponent(Adultos2)
                                .addGap(18, 18, 18)
                                .addComponent(Peso4)
                                .addGap(18, 18, 18)
                                .addComponent(Dinero4)
                                .addGap(18, 18, 18)
                                .addComponent(Carrito4)))))
                .addGap(53, 53, 53)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addComponent(DogChow3)
                                .addGap(18, 18, 18)
                                .addComponent(Cachorros2)
                                .addGap(18, 18, 18)
                                .addComponent(Peso7)
                                .addGap(18, 18, 18)
                                .addComponent(Dinero7)
                                .addGap(18, 18, 18)
                                .addComponent(Carrito7))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addComponent(DogChow2)
                                .addGap(18, 18, 18)
                                .addComponent(Cachorros3)
                                .addGap(18, 18, 18)
                                .addComponent(Peso6)
                                .addGap(18, 18, 18)
                                .addComponent(Dinero6)
                                .addGap(18, 18, 18)
                                .addComponent(Carrito6)))))
                .addGap(39, 39, 39)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProCan)
                            .addComponent(ProCan1))
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cachorros4)
                            .addComponent(Cachorros5))
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Peso8)
                            .addComponent(Peso9))
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dinero8)
                            .addComponent(Dinero9))
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Carrito8)
                            .addComponent(Carrito9))))
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProCan2)
                            .addComponent(ProCan3))
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Adultos5)
                            .addComponent(Adultos4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Peso12)
                            .addComponent(Peso13))
                        .addGap(18, 18, 18)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dinero12)
                            .addComponent(Dinero13))
                        .addGap(24, 24, 24)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Carrito10)
                            .addComponent(Carrito11))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(Principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Carrito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carrito1ActionPerformed
    int productoId = 205; 
    Carrito1 carrito = new Carrito1();
    carrito.agregarProductoAlCarro(productoId);
    //Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Producto agregado al carrito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Carrito1ActionPerformed

    private void CarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarritoActionPerformed
    int productoId = 205; 
    Carrito1 carrito = new Carrito1();
    carrito.agregarProductoAlCarro(productoId);
    //Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Producto agregado al carrito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_CarritoActionPerformed

    private void Carrito2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carrito2ActionPerformed
    int productoId = 206; 
    Carrito1 carrito = new Carrito1();
    carrito.agregarProductoAlCarro(productoId);
    //Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Producto agregado al carrito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Carrito2ActionPerformed

    private void Carrito3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carrito3ActionPerformed
    int productoId = 206; 
    Carrito1 carrito = new Carrito1();
    carrito.agregarProductoAlCarro(productoId);
    //Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Producto agregado al carrito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Carrito3ActionPerformed

    private void Carrito4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carrito4ActionPerformed
    int productoId = 207; 
    Carrito1 carrito = new Carrito1();
    carrito.agregarProductoAlCarro(productoId);
    //Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Producto agregado al carrito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Carrito4ActionPerformed

    private void Carrito5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carrito5ActionPerformed
    int productoId = 207; 
    Carrito1 carrito = new Carrito1();
    carrito.agregarProductoAlCarro(productoId);
    //Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Producto agregado al carrito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Carrito5ActionPerformed

    private void Carrito7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carrito7ActionPerformed
    int productoId = 208; 
    Carrito1 carrito = new Carrito1();
    carrito.agregarProductoAlCarro(productoId);
    //Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Producto agregado al carrito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Carrito7ActionPerformed

    private void Carrito6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carrito6ActionPerformed
    int productoId = 208; 
    Carrito1 carrito = new Carrito1();
    carrito.agregarProductoAlCarro(productoId);
    //Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Producto agregado al carrito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Carrito6ActionPerformed

    private void Carrito8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carrito8ActionPerformed
    int productoId = 203; 
    Carrito1 carrito = new Carrito1();
    carrito.agregarProductoAlCarro(productoId);
    //Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Producto agregado al carrito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Carrito8ActionPerformed

    private void Carrito9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carrito9ActionPerformed
    int productoId = 203; 
    Carrito1 carrito = new Carrito1();
    carrito.agregarProductoAlCarro(productoId);
    //Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Producto agregado al carrito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Carrito9ActionPerformed

    private void Carrito10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carrito10ActionPerformed
    int productoId = 204; 
    Carrito1 carrito = new Carrito1();
    carrito.agregarProductoAlCarro(productoId);
    //Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Producto agregado al carrito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Carrito10ActionPerformed

    private void Carrito11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carrito11ActionPerformed
    int productoId = 204; 
    Carrito1 carrito = new Carrito1();
    carrito.agregarProductoAlCarro(productoId);
    //Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Producto agregado al carrito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Carrito11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adultos;
    private javax.swing.JLabel Adultos1;
    private javax.swing.JLabel Adultos2;
    private javax.swing.JLabel Adultos3;
    private javax.swing.JLabel Adultos4;
    private javax.swing.JLabel Adultos5;
    private javax.swing.JLabel BuenCan;
    private javax.swing.JLabel BuenCan1;
    private javax.swing.JLabel BuenCan2;
    private javax.swing.JLabel BuenCan3;
    private javax.swing.JLabel Cachorros;
    private javax.swing.JLabel Cachorros1;
    private javax.swing.JLabel Cachorros2;
    private javax.swing.JLabel Cachorros3;
    private javax.swing.JLabel Cachorros4;
    private javax.swing.JLabel Cachorros5;
    private javax.swing.JButton Carrito;
    private javax.swing.JButton Carrito1;
    private javax.swing.JButton Carrito10;
    private javax.swing.JButton Carrito11;
    private javax.swing.JButton Carrito2;
    private javax.swing.JButton Carrito3;
    private javax.swing.JButton Carrito4;
    private javax.swing.JButton Carrito5;
    private javax.swing.JButton Carrito6;
    private javax.swing.JButton Carrito7;
    private javax.swing.JButton Carrito8;
    private javax.swing.JButton Carrito9;
    private javax.swing.JLabel Dinero;
    private javax.swing.JLabel Dinero1;
    private javax.swing.JLabel Dinero12;
    private javax.swing.JLabel Dinero13;
    private javax.swing.JLabel Dinero2;
    private javax.swing.JLabel Dinero3;
    private javax.swing.JLabel Dinero4;
    private javax.swing.JLabel Dinero5;
    private javax.swing.JLabel Dinero6;
    private javax.swing.JLabel Dinero7;
    private javax.swing.JLabel Dinero8;
    private javax.swing.JLabel Dinero9;
    private javax.swing.JLabel DogChow;
    private javax.swing.JLabel DogChow1;
    private javax.swing.JLabel DogChow2;
    private javax.swing.JLabel DogChow3;
    private javax.swing.JLabel Peso;
    private javax.swing.JLabel Peso1;
    private javax.swing.JLabel Peso12;
    private javax.swing.JLabel Peso13;
    private javax.swing.JLabel Peso2;
    private javax.swing.JLabel Peso3;
    private javax.swing.JLabel Peso4;
    private javax.swing.JLabel Peso5;
    private javax.swing.JLabel Peso6;
    private javax.swing.JLabel Peso7;
    private javax.swing.JLabel Peso8;
    private javax.swing.JLabel Peso9;
    private javax.swing.JPanel Principal;
    private javax.swing.JLabel ProCan;
    private javax.swing.JLabel ProCan1;
    private javax.swing.JLabel ProCan2;
    private javax.swing.JLabel ProCan3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
