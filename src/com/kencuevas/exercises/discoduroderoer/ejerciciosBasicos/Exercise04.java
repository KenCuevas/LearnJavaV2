package com.kencuevas.exercises.discoduroderoer.ejerciciosBasicos;

import javax.swing.*;

/**
 * Author: Kenny Cuevas
 * Date 03-01-2020
 * Tittle:Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
 */
public class Exercise04 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");

        System.out.println("Bienvenido " + nombre);
    }
}
