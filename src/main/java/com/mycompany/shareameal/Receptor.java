/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shareameal;

/**
 *
 * @author USUARIO
 */
public class Receptor {
    
    public String productos;
    public int cant_productos;
    public String direccion;

    public Receptor(String productos, int cant_productos, String direccion) {
        this.productos = productos;
        this.cant_productos = cant_productos;
        this.direccion = direccion;
    }

    public Receptor(String productos, int cant_productos) {
        this.productos = productos;
        this.cant_productos = cant_productos;
    }
    
    

    public Receptor() {
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getCant_productos() {
        return cant_productos;
    }

    public void setCant_productos(int cant_productos) {
        this.cant_productos = cant_productos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
