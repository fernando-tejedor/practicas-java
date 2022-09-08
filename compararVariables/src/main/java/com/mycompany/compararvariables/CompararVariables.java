/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.compararvariables;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class CompararVariables {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;
        System.out.println("ingrese el numero 1");
        numero1 = entrada.nextDouble();
        System.out.println("ingrese el numero 2");
        numero2 = entrada.nextDouble();
        if (numero1<numero2){
            System.out.println(numero1+ "es menor que" +numero2);
        }
        else if (numero1==numero2){
            System.out.println(numero1+ "es igual a" +numero2);
        }
        else
            System.out.println(numero1 +"es mayor que"+ numero2);    
        
        }
}
