package com.kencuevas.exercises.discoduroderoer.ejerciciosBasicos;
/*
Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas vocales hay en total (recorre el String con charAt).
 */
public class Exercise22 {
    public static void main(String[] args) {
        final String SENTENCE = "La lluvia en Sevilla es una maravilla";
        int n = 0;
        for (int i = 0; i < SENTENCE.length(); i++){
            if (SENTENCE.charAt(i)=='a'||
                    SENTENCE.charAt(i)=='e'||
                    SENTENCE.charAt(i)=='i'||
                    SENTENCE.charAt(i)=='o'||
                    SENTENCE.charAt(i)=='u'){
                n++;
            }
        }
        System.out.println("En la frase hay un total de: " + n + " vocales");
    }
}
