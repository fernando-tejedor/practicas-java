/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplocolecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class EjemploColecciones {

    public static void main(String[] args) {
        List miLista=new ArrayList();
        
        for(int i=0;i<100;i++){
        miLista.add(i);
        System.out.println("Agrego el valor de "+ i + " a la lista");
    }
        for(int j=0; j<miLista.size();j++){
            System.out.println(miLista.get(j));
        }
}}
