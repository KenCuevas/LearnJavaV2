package EjerciciosBasicos;

import javax.swing.*;

/**
 * Author: Kenny Cuevas
 * Date 03-01-2020
 * Tittle: Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
 */
public class Exercise06 {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));

        if( number % 2 == 0){
            System.out.println("El numero es divisible entre 2");
        }else{
            System.out.println("El numero no es divisible entre 2");
        }
    }
}
