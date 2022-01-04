package EjerciciosBasicos;

import java.util.Scanner;

/**
 * Author: Kenny Cuevas
 * Date 03-01-2020
 * Tittle: Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.
 */
public class Exercise08 {
    public static void main(String[] args) {
        char letra;
        //Instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        //Le solicitamos el numero al usuario
        System.out.println("Introduce un caracter");
        //Guardamos el numero en la variable numero
        letra = sc.next().charAt(0);

        int converterToAscii = (int) letra;

        System.out.println(converterToAscii);
    }
}
