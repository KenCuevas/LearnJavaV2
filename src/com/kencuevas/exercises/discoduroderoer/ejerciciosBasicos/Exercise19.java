package com.kencuevas.exercises.discoduroderoer.ejerciciosBasicos;

import java.util.Scanner;

/**
 * Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
 * Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.
 */
public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        //Evalua que el numero es un entero positivo, si no lo es, vuelve a pedir el numero
        do {
            System.out.println("Ingresa un numero entero positivo");
            number = sc.nextInt();
        }while (number <= 0);

        //Convertimos el numero entero a un string
        String numberToString = Integer.toString(number);

        //Evaluamos si el string tiene 1 cifra muestra la palabra en singular y si tiene mas de 1, entonces la muestra en plural.
        if(numberToString.length() == 1){
            System.out.println(numberToString.length() + " cifra");
        }else {
            System.out.println(numberToString.length() + " cifras");
        }
    }
}
