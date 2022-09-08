/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciocomposicion29;

/**
 *
 * @author Lenovo
 */
public class EjercicioComposicion29 {

    public static void main(String[] args) {
       Rueda rueda1=new Rueda();
       Rueda rueda2=new Rueda();
       Rueda rueda3=new Rueda();
       Rueda rueda4=new Rueda();
       
       Automovil carro = new Automovil("Toyota Hilux",4);
       Rueda[]ruedas = carro.getRuedas();
       for(Rueda llanta:ruedas){
       System.out.println(llanta.getAncho());
    }
    }
}
