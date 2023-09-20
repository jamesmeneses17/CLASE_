/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seguimiento;

/**
 *
 * @author Jamex
 */
public class EstadoEnvio {
    
    private String codigo;
    private String fecha;
    private String direccion;
    private String codigoPaquete;
    private String estado;

    public EstadoEnvio() {
    }

    public EstadoEnvio(String codigo, String fecha, String direccion, String codigoPaquete, String estado) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.direccion = direccion;
        this.codigoPaquete = codigoPaquete;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(String codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void showInfo(){
        System.out.println("  ");
        System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Fecha: "+this.getFecha());
        System.out.println("Direccion: "+this.getDireccion());
        System.out.println("Codigo Paquete: "+this.getCodigoPaquete());
        System.out.println("Estado: "+this.getEstado());
        System.out.println("  ");
        
        
    }
    
 
    public void historialpaquete(ListaPaquete listaPaquete , String codigo){
        
        for (Paquete paquete : listaPaquete.getPaqueteList()){
            if ((paquete.getCodigoUnico().equals(codigo) && this.getCodigoPaquete().equals(codigo))){
                System.out.println("PAQUETE: "+paquete.getCodigoUnico() + "  ESTADO DEL PAQUETE: "+ this.getEstado());     
            }
        }  
    }
    
    public void paquetemovimiento(ListaPaquete listaPaquete){
        for (Paquete paquete : listaPaquete.getPaqueteList()){
            if ((paquete.getCodigoUnico() == this.getCodigoPaquete())&& (this.getEstado().equals("En camino")  ||  this.getEstado().equals("Proceso de Entrega"))){
                System.out.println("  ");
                System.out.println("PAQUETE: "+ paquete.getCodigoUnico()+ " ESTADO DEL PAQUETE : "+this.getEstado());
                
            }
        }
    }
    
    public void listaenviado (ListaPaquete listaPaquete, ListaCliente listaCliente,String codigocliente){
        for (Paquete paquete : listaPaquete.getPaqueteList()){
            for (Cliente cliente : listaCliente.getClienteList()){
                if ((paquete.getCodigoUnico()== this.getCodigoPaquete()) && (paquete.getCodigoCliente().equals(codigocliente) && cliente.getCodigo().equals(codigocliente)) && (this.getEstado().equals("Paquete Enviado")  ||  this.getEstado().equals("Paquete Recibido") )){
                    System.out.println("CLIENTE: "+cliente.getNombre()+" PAQUETE: "+paquete.getCodigoUnico()+" ESTADO DEL PAQUETE: "+this.getEstado());
                }
            }
        }
        
    }
     public void listapaquetesenviadosyrecibido(ListaPaquete listaPaquete,ListaCliente listaCliente){
        for (Paquete paquete : listaPaquete.getPaqueteList()){
             for (Cliente cliente : listaCliente.getClienteList()){
                if ((paquete.getCodigoUnico()== this.getCodigoPaquete()) && (paquete.getCodigoCliente().equals(cliente.getCodigo())) && ( this.getEstado().equals("Paquete Enviado")  ||  this.getEstado().equals("Paquete Recibido") )){
                    System.out.println("CLIENTE: "+cliente.getNombre()+" PAQUETE: "+paquete.getCodigoUnico()+" ESTADO DEL PAQUETE: "+this.getEstado());
                }
            }
             
            
        }
    }
    
    
    
    
 
    
}
