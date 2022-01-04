package EjerciciosBasicos;

import java.util.Scanner;

/**
 * Author: Kenny Cuevas
 * Date 03-01-2020
 * Tittle:Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
 * Por ejemplo: si introduzco un 97, me muestre una a.
 */
public class Exercise07 {
    public static void main(String[] args) {
        int numero;
        //Instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);

        //Le solicitamos el numero al usuario
        System.out.println("Introduce el numero");
        //Guardamos el numero en la variable numero
        numero = sc.nextInt();

        char converterToAscii = (char) numero;

        System.out.println(converterToAscii);
    }
}
