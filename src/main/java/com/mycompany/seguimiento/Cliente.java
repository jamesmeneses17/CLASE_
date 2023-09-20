/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seguimiento;

/**
 *
 * @author Jamex
 */
public class Cliente {
    
    private String codigo;
    private String nombre;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void showInfo(){
        System.out.println("  ");
        System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Direccion: "+this.getDireccion());
        System.out.println("  ");
    }
    
}
