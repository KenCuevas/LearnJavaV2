package com.kencuevas.exercises.discoduroderoer.ejerciciosBasicos;
/**
 * Author: Kenny Cuevas
 * Date 03-01-2020
 * Tittle: Declara dos variables numéricas (con el valor que desees), muestra por consola la suma,
 * resta, multiplicación, división y módulo (resto de la división).
 */
public class Exercise01 {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 15;

        System.out.println("Sumando " + numberOne+numberTwo);
        System.out.println("Restando " + (numberOne-numberTwo));
        System.out.println("Multiplicando " + numberOne*numberTwo);
        System.out.println("Dividiendo " + (numberOne/numberTwo));
        System.out.println("Modulo " + (numberOne%numberTwo));
    }
}
