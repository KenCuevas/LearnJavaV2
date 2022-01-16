package EjerciciosBasicos;

import java.util.Scanner;

/**
 * Pide por teclado dos número y genera 10 números aleatorios
 * entre esos números. Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).
 */
public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se pide por teclado los dos numeros var = numberOne, var = numberTwo.
        System.out.println("Ingresa el primero numero");
        int numberOne = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        int numberTwo = sc.nextInt();

        for(int contador = 0; contador < 10; contador++){
            int randomNumberGenerator = (int)Math.floor(Math.random()*(numberOne - numberTwo)+numberTwo);
            System.out.println(" ");
            System.out.println(randomNumberGenerator);
        }
    }
}
