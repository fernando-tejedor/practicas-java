/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notastripulantes;

/**
 *
 * @author Lenovo
 */
public class Tripulantes {
    
    public double notaJava=0;
    public double notaIngles=0;
    public double notaCoaching=0;
    public String nombre;
    
    
    
    public double[] notas_java(){
    
        MateriaJava mj = new MateriaJava();
        
        double[] notas = mj.ingresarNotas();
       
        return notas;
    
    }
 
    public double nota_def_java(double[] notas){
    
        MateriaJava mj = new MateriaJava();
        
        double nota = mj.promedio(notas[0],notas[1],notas[2],notas[3],notas[4]);
     
        return nota;
    
    }
    
   
    public double promedio(double notaJava,double notaIngles, double notaCoaching){
    
        double promedio = notaJava * 0.8 + notaIngles * 0.1 + notaCoaching * 0.1 ;
         
        return promedio;
    }
    
    
    
}