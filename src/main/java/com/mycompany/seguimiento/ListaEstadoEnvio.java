/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seguimiento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jamex
 */
public class ListaEstadoEnvio {
    
     private List<EstadoEnvio> estadoenvioList;
    
    public ListaEstadoEnvio(){
        this.estadoenvioList=new ArrayList<>();
    }

    public ListaEstadoEnvio(List<EstadoEnvio> estadoenvioList) {
        this.estadoenvioList = estadoenvioList;
    }
    
    public void showList(){
        for (EstadoEnvio estadoenvio : estadoenvioList){
            estadoenvio.showInfo();
        }
    }
    
    public void addEstadoEnvioToList(EstadoEnvio ev){
        this.estadoenvioList.add(ev);
    }
    
    public List<EstadoEnvio> getEstadoenvioList(){
        return estadoenvioList;
    }
    
    public void historialpaquete(ListaPaquete listaPaquete, String codigo){
        for (EstadoEnvio estadoenvio :estadoenvioList){
            estadoenvio.historialpaquete(listaPaquete, codigo);
        }
    }
    
    public void paquetemovimiento(ListaPaquete listaPaquete){
        for (EstadoEnvio estadoenvio : estadoenvioList){
            estadoenvio.paquetemovimiento(listaPaquete);
        }
    }
    
    public void listaenviado(ListaPaquete listaPaquete,ListaCliente listaCliente,String codigocliente){
        for (EstadoEnvio estadoenvio : estadoenvioList){
            estadoenvio.listaenviado(listaPaquete, listaCliente, codigocliente);
        }
    }
    
      public void listapaquetesenviadosyrecibido (ListaPaquete listaPaquete,ListaCliente listaCliente){
        for (EstadoEnvio estadoenvio : estadoenvioList){
            estadoenvio.listapaquetesenviadosyrecibido(listaPaquete, listaCliente);
        }
    }
    
   
    
    
    
}
