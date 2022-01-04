package EjerciciosBasicos;

import java.util.Scanner;

/**
 * Author: Kenny Cuevas
 * Date 03-01-2020
 * Tittle:Lee un número por teclado que pida el precio de un producto (puede tener decimales)
 * y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 */
public class Exercise09 {
    final static double IVA = 0.21;
    public static void main(String[] args) {
        double precioProducto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto");
        precioProducto = sc.nextDouble();

        double calculoIVA = precioProducto*IVA;

        System.out.println("EL precio de venta del producto sin IVA incluido es de: " + precioProducto);
        System.out.println("El IVA seria igual a: " + calculoIVA);
        System.out.println("El precio total con IVA incluido es de: " + (precioProducto+calculoIVA));
    }
}
