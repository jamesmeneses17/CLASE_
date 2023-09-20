/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seguimiento;

import java.util.List;

/**
 *
 * @author James Meneses y Yeferson Maya
 */
public class Main {
    
    public static void main(String[] args) {
        ListaCliente clientes = new ListaCliente();
        clientes.addClienteToList(new Cliente ("Cliente1","Juanes","Bogota"));
        clientes.addClienteToList(new Cliente ("Cliente2","Maria","Mocoa"));
        clientes.showList();
        
        ListaPaquete paquete = new ListaPaquete();
        paquete.addPaqueteToList(new Paquete ("001",50.3,"Cliente1"));
        paquete.addPaqueteToList(new Paquete ("002",10.6,"Cliente2"));
        paquete.showList();
        
        ListaEstadoEnvio envio = new ListaEstadoEnvio();
        envio.addEstadoEnvioToList(new EstadoEnvio ("E01","17-05-2023","Bogota","001","Paquete Enviado"));
        envio.addEstadoEnvioToList(new EstadoEnvio ("E02","18-05-2023","Bogota","001","En camino"));
        envio.addEstadoEnvioToList(new EstadoEnvio ("E03","19-05-2023","Bogota","001","Proceso de Entrega"));
        envio.addEstadoEnvioToList(new EstadoEnvio ("E04","19-05-2023","Bogota","001","Paquete Recibido"));
              
        envio.addEstadoEnvioToList(new EstadoEnvio ("E05","17-05-2023","Bogota","002","Paquete Enviado"));
        envio.addEstadoEnvioToList(new EstadoEnvio ("E06","18-05-2023","Bogota","002","En camino"));
        envio.addEstadoEnvioToList(new EstadoEnvio ("E07","19-05-2023","Bogota","002","Proceso de Entrega"));
        envio.showList();
        
        System.out.println("  ");
        System.out.println("HISTORIAL DE ESTADO DE UN PAQUETE ESPECIFICO  ");
        envio.historialpaquete(paquete, "001");
        System.out.println("  ");
        System.out.println("PAQUETES EN TRANSITO : EN CAMINO - PROCESO DE ENTREGA");
        envio.paquetemovimiento(paquete);
        System.out.println("  ");
        System.out.println("LISTA ENVIADO POR CLIENTE");
        envio.listaenviado(paquete, clientes, "Cliente1");
        // HACE UNA LISTA DE TODOS LOS PAQUETES QUE SE HA ENVIADO Y RECIBIDO EN GENERAL 
         // envio.listapaquetesenviadosyrecibido(paquete, clientes);

        
    }
 
    
}
