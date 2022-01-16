package EjerciciosBasicos;

import java.util.Scanner;

/**
 * Author: Kenny Cuevas
 * Escribe una aplicación con un String que contenga una contraseña cualquiera.
 * Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando
 * aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo
 * “Enhorabuena”. Piensa bien en la condición de salida (3 intentos y si
 * acierta sale, aunque le queden intentos).
 */
public class Exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String PASS = "lacasita";
        final int INTENTOS = 3;

        for (int i = 1; i <= INTENTOS; i++){
            System.out.println("Ingresa la contrasena:");
            String passEnter = sc.next();

            if (passEnter.equals(PASS)){
                System.out.println("Enhorabuena");
                break;
            }
        }
    }
}
