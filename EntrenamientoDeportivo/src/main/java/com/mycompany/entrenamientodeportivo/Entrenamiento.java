/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entrenamientodeportivo;

/**
 *
 * @author Lenovo
 */
public class Entrenamiento {
    public double tiempoEntrenamiento;
    
    public void iniciarEntrenamiento(Entrenador entrenador,Deportista deportista,double tiempo){
    System.out.println("el entrenador es "+entrenador.nombre );
    System.out.println("el deportista es "+deportista.nombre );
    System.out.println("el tiempo de entrenamiento es "+tiempo );
    }
}
