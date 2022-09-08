/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicionales;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Condicionales {

    public static void main(String[] args) {
        
        System.out.println("ingrese el dia de la semana");
        Scanner in = new Scanner(System.in);
            int numero1 = in.nextInt();
            switch(numero1){
               case 1:
                  System.out.println("el dia es lunes");
                  break;
               case 2:
                  System.out.println("el dia es martes");
                   break;
              case 3:
                  System.out.println("el dia es miercoles");
                  break;
              case 4:
                  System.out.println("el dia es jueves");
                   break;
              case 5:
                  System.out.println("el dia es viernes");
                   break;
              default:
                  System.out.println("no es un dia laboral");
                   break;
           
           }

        
    }
}
