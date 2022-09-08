/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.claseherencia29;

/**
 *
 * @author Lenovo
 */
public class ClaseHerencia29 {

    public static void main(String[] args) {
        
    Perro perro1 = new Perro("Caiser");
    Gato gato1 = new Gato ("Michi");
    perro1.setnPatas(4);
    gato1.setnPatas(4);
    
    System.out.println(perro1.toString());
    System.out.println(gato1.toString());
    }
}
