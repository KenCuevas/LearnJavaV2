package com.kencuevas.exercises.discoduroderoer.ejerciciosBasicos;
/**
 * Author: Kenny Cuevas
 * Date 03-01-2020
 * Tittle: Declara 2 variables numéricas (con el valor que desees),
 * he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
 */
public class Exercise02 {
    public static void main(String[] args) {
        int numberOne = 1;
        int numberTwo = 3;

        if(numberOne > numberTwo){
            System.out.println("El numero " + numberOne + " es mayor que " + numberTwo);
        }if(numberOne == numberTwo){
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("El numero " + numberTwo + " es mayor que " + numberOne);
        }
    }
}
