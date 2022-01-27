package com.kencuevas.exercises.discoduroderoer.ejerciciosBasicos;

public class Exercise24 {
    /*
    Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII.
    Muestralos en linea recta, separados por un espacio entre cada carácter.
     */
    public static void main(String[] args) {
        String SENTENCE = "La lluvia en Sevilla es una maravilla";
        int javaguide = 12;

        for (int i = 0; i < SENTENCE.length(); i++){
            int recorrido = SENTENCE.charAt(i);

            System.out.println(recorrido + " ");
        }

    }
}
