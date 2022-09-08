/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorelaciones28;

/**
 *
 * @author Lenovo
 */
public class Dueno {
    public String nombre;
    
    public Animales[] mascotas;
    
public void alimentarMascota(Animales mascota){
    System.out.println(this.nombre +" alimento al animal " + mascota.nombre);
    }
}
