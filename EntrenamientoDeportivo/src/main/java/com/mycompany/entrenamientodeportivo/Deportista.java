/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entrenamientodeportivo;

/**
 *
 * @author Lenovo
 */
public class Deportista {
    public String nombre;
    public int edad;
    public int nivel;
    public float peso;

    public Deportista() {
    }

    public Deportista(String nombre) {
        this.nombre = nombre;
    }

    public Deportista(String nombre, int edad, int nivel, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = nivel;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNivel() {
        return nivel;
    }

    public float getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
}
