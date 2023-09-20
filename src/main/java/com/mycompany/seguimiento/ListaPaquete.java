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
public class ListaPaquete {
    
    private List<Paquete> paqueteList;
    
    public ListaPaquete(){
        paqueteList= new ArrayList<>();
        
    }

    public ListaPaquete(List<Paquete> paqueteList) {
        this.paqueteList = paqueteList;
    }
    
    public void addPaqueteToList(Paquete p){
        this.paqueteList.add(p);
    }
    
    public void showList(){
        for (Paquete paquete : paqueteList){
            paquete.showInfo();
        }
    }
    
    public List <Paquete> getPaqueteList(){
        return paqueteList;
    }
    
    
    
    
    
}
