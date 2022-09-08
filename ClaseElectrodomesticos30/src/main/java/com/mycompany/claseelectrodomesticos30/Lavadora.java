/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseelectrodomesticos30;

/**
 *
 * @author Lenovo
 */
public class Lavadora extends Electrodomesticos {
    private double carga;
    private final double CARGA_INICIO=5.0;

    public Lavadora() {
        super();
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }
    
    @Override
    public double precioFinal(){
        double resultado=super.precioFinal();
        if(this.carga>30){
        resultado+= 50;
        }
        return resultado;
    }
}
