package com.kencuevas.exercises.discoduroderoer.ejerciciosBasicos;

import javax.swing.*;

/**
 * Author: Kenny Cuevas
 * Date 03-01-2020
 * Tittle:Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
 * (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 */
public class Exercise05 {
    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio a calcular"));
        double area = Math.PI*Math.pow(radio, 2);
        System.out.println(area);
    }
}
