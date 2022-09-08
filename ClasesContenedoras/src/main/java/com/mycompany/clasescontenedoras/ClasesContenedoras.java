/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clasescontenedoras;

/**
 *
 * @author Lenovo
 */
public class ClasesContenedoras {

    public static void main(String[] args) {
        MisionTic misiontic2022=new MisionTic();
        
        Ciclos ciclo1 = new Ciclos("ciclo1");
        Ciclos ciclo2 = new Ciclos("ciclo2");
        Ciclos ciclo3 = new Ciclos("ciclo3");
        Ciclos ciclo4 = new Ciclos("ciclo4");
        
        misiontic2022.addCiclo(ciclo1);
        misiontic2022.addCiclo(ciclo2);
        misiontic2022.addCiclo(ciclo3);
        misiontic2022.addCiclo(ciclo4);
        
        System.out.println(misiontic2022.getCiclos());
        
        
    }
}
