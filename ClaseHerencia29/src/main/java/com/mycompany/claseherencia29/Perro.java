/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseherencia29;

/**
 *
 * @author Lenovo
 */
public class Perro extends Animal {

    private boolean lider;

    public Perro(String nombre) {
        super(nombre);
    }

    public Perro(boolean lider, String nombre) {
        super(nombre);
        this.lider = lider;
    }

    
    
    
}
