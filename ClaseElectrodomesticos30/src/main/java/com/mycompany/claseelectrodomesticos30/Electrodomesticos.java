/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseelectrodomesticos30;

/**
 *
 * @author Lenovo
 */
public class Electrodomesticos {
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomesticos() {
        this.consumoEnergetico='F';
        this.color="Blanco";
        this.peso=5;
        this.precioBase=100;
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public Electrodomesticos(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color="blanco";
        this.consumoEnergetico='F';
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
    
    private char comprobarConsumoEnergetico(char letra){
        char retorno='F';
        char[]letras = {'A','B','C','E','F'};
        for(char clave :letras){
         if(letra==clave){
           retorno= letra;
           break;
         }
         else{
           retorno='F';
                 }           
        }
     return retorno;
    }
    
    private String comprobarColor(String color){
        return color;
    }
    
    public double precioFinal(){
        double resultado=this.precioBase;
        switch(this.consumoEnergetico){
            case 'A':
                resultado+=100;
                break;
            case 'B':
                resultado+=80;
                break;
             case 'C':
                resultado+=60;
                break;
             case 'D':
                resultado+=50;
                break;
             case 'E':
                resultado+=30;
                break;
             case 'F':
                resultado+=10;
                break;
             default:
                 resultado+=10;
                 break;
                
        }
        
        if(this.peso>=0 && this.peso<20){
            resultado+=10;
        }
        else if(this.peso>=20 && this.peso<50){
            resultado+=50;
        }
        else if(this.peso>=50 && this.peso<80){
            resultado+=80;
        }
        else{
            resultado+= 100;
        }        
        return resultado;
        }

   

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
}
