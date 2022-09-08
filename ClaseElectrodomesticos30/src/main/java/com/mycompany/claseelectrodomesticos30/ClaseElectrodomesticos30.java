/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.claseelectrodomesticos30;

/**
 *
 * @author Lenovo
 */
public class ClaseElectrodomesticos30 {

    public static void main(String[] args) {
       Electrodomesticos[] electrodomestico = new Electrodomesticos[10];
        
        electrodomestico[0]= new Lavadora(40,200,"Blanco",'B',80);
        electrodomestico[1]= new Television();
        electrodomestico[2]= new Television();
        electrodomestico[3]= new Electrodomesticos(150,"Negro",'C',50);
        electrodomestico[4]= new Television();
        electrodomestico[5]= new Television();
        electrodomestico[6]= new Lavadora();
        electrodomestico[7]= new Electrodomesticos();
        electrodomestico[8]= new Television();
        electrodomestico[9]= new Lavadora();
        
        double sumaLavadoras=0;
        double sumaTelevisores=0;
        double sumaElectrodomesticos=0;
        
        for(Electrodomesticos electrodomesticos: electrodomestico){
            if(electrodomesticos instanceof Lavadora){
                sumaLavadoras++;
            }
            if(electrodomesticos instanceof Television){
                sumaTelevisores++;
            }
            if(electrodomesticos instanceof Electrodomesticos){
                sumaElectrodomesticos++;
            }
            System.out.print(electrodomesticos.toString());
            System.out.println(electrodomesticos.precioFinal());
        }
       System.out.println(sumaTelevisores);
       System.out.println(sumaLavadoras);
       System.out.println(sumaElectrodomesticos);
    }
}
