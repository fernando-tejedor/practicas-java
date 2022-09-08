/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasescontenedoras;

/**
 *
 * @author Lenovo
 */
public class Ciclos {
    private String nombreCiclos;

    public Ciclos(String nombreCiclos) {
        this.nombreCiclos = nombreCiclos;
    }
    

    public String getNombreCiclos() {
        return nombreCiclos;
    }

    public void setNombreCiclos(String nombreCiclos) {
        this.nombreCiclos = nombreCiclos;
    }

    @Override
    public String toString() {
        return "Ciclos{" + "nombreCiclos=" + nombreCiclos + '}';
    }
    
    
}
