package com.kencuevas.exercises.discoduroderoer.ejerciciosBasicos;

/**
 * Author: Kenny Cuevas
 * Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
 */
public class Exercise12 {
    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++){
            if (n % 2 == 0 || n % 3 == 0){
                System.out.println(n);
            }
        }
    }
}
