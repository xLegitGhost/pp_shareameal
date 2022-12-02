/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shareameal;

/**
 *
 * @author USUARIO
 */
public class Donante {
    
    public int cant_dinero;
    public int cant_producto;
    public String producto;

    public Donante(int cant_dinero, int cant_producto, String producto) {
        this.cant_dinero = cant_dinero;
        this.cant_producto = cant_producto;
        this.producto = producto;
    }

    public Donante() {
    }

    public Donante(int cant_producto, String producto) {
        this.cant_producto = cant_producto;
        this.producto = producto;
    }
    
    

    public float getCant_dinero() {
        return cant_dinero;
    }

    public void setCant_dinero(int cant_dinero) {
        this.cant_dinero = cant_dinero;
    }

    public int getCant_producto() {
        return cant_producto;
    }

    public void setCant_producto(int cant_producto) {
        this.cant_producto = cant_producto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    public void guardarDatos(int cant_dinero, int cant_producto, String producto) {
        
    }
}
