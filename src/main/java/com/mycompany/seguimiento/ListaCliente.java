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
public class ListaCliente {
    
    List<Cliente> clienteList;
    
    public ListaCliente(){
        this.clienteList= new ArrayList<>();
    }

    public ListaCliente(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }
    
    public void addClienteToList(Cliente c){
        this.clienteList.add(c);
    }
    
    public void showList(){
        for (Cliente c: this.clienteList){
            c.showInfo();
        }
    }
    
    public List<Cliente> getClienteList(){
        return clienteList;
    }
    
}
