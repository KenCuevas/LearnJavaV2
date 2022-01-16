package EjerciciosBasicos;

import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.
 */
public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un dia de la semana");
        String diaSemana = sc.nextLine();

        switch (diaSemana){
            case "Domingo":
                System.out.println("No laborable");
                break;
            case "Lunes":
                System.out.println("Laborable");
                break;
            case "Martes":
                System.out.println("Laborable");
                break;
            case "Miercoles":
                System.out.println("Laborable");
                break;
            case "Jueves":
                System.out.println("Laborable");
                break;
            case "Viernes":
                System.out.println("Laborable");
                break;
            case "Sabado":
                System.out.println("Laborable hasta las 12:00 PM");
                break;
            default:
                System.out.println("Ingresa un dia valido");
                break;
        }
    }
}
