/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseherencia29;

/**
 *
 * @author Lenovo
 */
public class Gato extends Animal{
    private String ronrroneo;

    public Gato(String nombre) {
        super(nombre);
    }

    public Gato(String ronrroneo, String nombre) {
        super(nombre);
        this.ronrroneo = ronrroneo;
    }

   
        
}
