package com.kencuevas.exercises.discoduroderoer.ejerciciosBasicos;

import java.util.Scanner;

/**
 * Author: Kenny Cuevas
 * Realiza una aplicación que nos calcule una ecuación de segundo grado.
 * Debes pedir las variables a, b y c por teclado y comprobar antes que
 * el discriminante (operación en la raíz cuadrada). Para la raíz cuadrada
 * usa el método sqlrt de Math. Te recomiendo que uses mensajes de traza.
 */
public class Exercise14 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor de a:");
        a = scanner.nextInt();
        System.out.println("Introduce el valor de b:");
        b = scanner.nextInt();
        System.out.println("Introduce el valor de c:");
        c = scanner.nextInt();

        double discriminante = Math.pow(b, 2)-(4*a*c);

        System.out.println(">>" + discriminante);

        if(discriminante>0){
            double x1 = ((b*(-1)) + Math.sqrt(discriminante))/(2*a);
            double x2 = ((b*(-1)) - Math.sqrt(discriminante))/(2*a);

            System.out.println("EL valor de X1 es de: " + x1 + "\r" + " El valor de X2 es de: " + x2);
        }else {
            System.out.println("El discriminante es negativo");
        }
    }
}
