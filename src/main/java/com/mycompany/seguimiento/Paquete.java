/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seguimiento;

/**
 *
 * @author Jamex
 */
public class Paquete {
    
    private String codigoUnico;
    private double peso;
    private String codigoCliente;

    public Paquete() {
    }

    public Paquete(String codigoUnico, double peso, String codigoCliente) {
        this.codigoUnico = codigoUnico;
        this.peso = peso;
        this.codigoCliente = codigoCliente;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    public void showInfo() {
        System.out.println("  ");
        System.out.println("Codigo Paquete: "+this.getCodigoUnico());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Codigo Cliente: "+this.getCodigoCliente());
        System.out.println(" ");
    }
    
}
