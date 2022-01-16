package EjerciciosBasicos;

import java.util.Scanner;

/**
 * Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá
 * tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrara la
 * suma de todas las ventas. Piensa que es lo que se repite y lo que no.
 */
public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numVentas = 0;
        System.out.println("Introduce el numero de ventas");
        numVentas = sc.nextInt();

        int sumVentas = 0;
        for (int i = 0; i < numVentas; i++){
            System.out.println("Introduce el precio de la venta");
            int ventas = sc.nextInt();

            sumVentas = sumVentas+ventas;
        }
        System.out.println("EL total de ventas fue de: " + sumVentas);
    }
}
