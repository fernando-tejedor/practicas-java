/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5.controlador;

/**
 *
 * @author Lenovo
 */
public class Producto {
    
    private String nombre;
    private String id;
    private double temperatura;
    private double valorBase;

    public Producto(String nombre, String id, double temperatura, double valorBase) {
        this.nombre = nombre;
        this.id = id;
        this.temperatura = temperatura;
        this.valorBase = valorBase;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" + "id=" + id + ", nombre=" + nombre + ", temperatura=" + temperatura + ", valorBase=" + valorBase + '}';
    }
    public double calcularCostoDeAlmacenamiento(){
        if (temperatura<21){
           return (valorBase*1.2); 
        }
        else{
            return (valorBase*1.1);
        }
    }
    
    
}
