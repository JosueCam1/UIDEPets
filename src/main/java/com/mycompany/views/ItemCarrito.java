/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.views;

/**
 *
 * @author Josue
 */
public class ItemCarrito {
    private final int productoId;
    private final String nombre;
    private final double precio;
    private int cantidad;
    
    public ItemCarrito(int productoId, String nombre, double precio, int cantidad) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public double getSubtotal() {
        return precio * cantidad;
    }
    
    // Getters y setters
    public int getProductoId() {
        return productoId;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
