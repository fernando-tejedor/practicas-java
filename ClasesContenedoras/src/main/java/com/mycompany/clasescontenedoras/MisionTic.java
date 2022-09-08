/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasescontenedoras;

import java.util.*;

/**
 *
 * @author Lenovo
 */
public class MisionTic {
    private String nombreMision;
    private List <Ciclos> ciclos;
    
    public MisionTic(){
        ciclos = new ArrayList();
    }
    
    public void addCiclo(Ciclos c){
        ciclos.add(c);
    }

    public String getNombreMision() {
        return nombreMision;
    }

    public void setNombreMision(String nombreMision) {
        this.nombreMision = nombreMision;
    }

    public List getCiclos() {
        return ciclos;
    }

    public void setCiclos(List ciclos) {
        this.ciclos = ciclos;
    }

    @Override
    public String toString() {
        return "MisionTic{" + "nombreMision=" + nombreMision + ", ciclos=" + ciclos + '}';
    }
    
}
