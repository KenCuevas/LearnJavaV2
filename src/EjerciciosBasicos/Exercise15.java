package EjerciciosBasicos;

import java.util.Scanner;

/**
 * Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
 * si no lo es lo volverá a pedir (do while), después muestra ese número por consola
 */
public class Exercise15 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingresa el numero:");
            number = sc.nextInt();
        }while (number <= 0);
        System.out.println(number);
    }
}
