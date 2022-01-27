package com.kencuevas.exercises.discoduroderoer.ejerciciosBasicos;
/**
 * Muestra los números primos entre 1 y 100.
 */
public class Exercise21 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            // Casting para devolver un entero.
            int squareRoot = (int) Math.sqrt(i);
            int counter = 0;

            //Bucle para contar los divisibles
            for (int j = squareRoot; j > 1; j--){
                if(i % j == 0){
                    counter++;
                }
            }
            if (counter<1){
                System.out.println(i);
            }
        }
    }
}
