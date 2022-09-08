/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.entrenamientodeportivo;

/**
 *
 * @author Lenovo
 */
public class EntrenamientoDeportivo {

    public static void main(String[] args) {
        EntrenamientoDeportivo ed =new EntrenamientoDeportivo();
        ed.ejecutarprograma();
    }
    public void ejecutarprograma(){
    Entrenador entrenadorjose = new Entrenador();
    entrenadorjose.nombre="jose";
    Deportista deportistapedro = new Deportista();
    deportistapedro.nombre="pedro";
    Deportista deportistajulio = new Deportista();
    deportistajulio.nombre="julio";
    Entrenamiento entrenamiento =new Entrenamiento();
    entrenamiento.iniciarEntrenamiento(entrenadorjose, deportistajulio, 3);
    }
}
