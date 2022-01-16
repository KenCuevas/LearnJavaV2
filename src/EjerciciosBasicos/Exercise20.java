package EjerciciosBasicos;

import java.util.Scanner;

/**
 * Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo.
 * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 * Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
 * NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
 */
public class Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Solicitamos el numero a evaluar
        System.out.println("Introduce el numero a evaluar");
        int number = sc.nextInt();

        //Evaluamos que el numero no sea 1, 0 o un numero negativo
        if (number <= 1){
            System.out.println("El numero " + number + " no es primo");
        }else {
            int raizCuadrada = (int) Math.sqrt(number);
            int contador = 0;

            //Se valida la raiz cuadrada para comprobar si es divisible
            for (int i = raizCuadrada; i > 1; i--){
                if (number % i == 0){
                    contador++;
                }
            }
            System.out.println(">> " + contador);
            if (contador < 1){
                System.out.println("El numero " + number + " es primo");
            } else {
                System.out.println("El numero " + number + " no es primo");
            }
        }
    }
}
