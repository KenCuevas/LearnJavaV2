package com.kencuevas.exercises.algorithms;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una frase y sabras si es palindromo o no.");
        String frase = sc.nextLine();

        if (isPalindrome(frase)){
            System.out.println("La frase " + frase + " es un palindromo");
        }else{
            System.out.println("La frase " + frase + " no es un palindromo");
        }
    }

    public static boolean isPalindrome(String phrase){
        //Mover los puntos, comas y acentos de la frase pasada.

        phrase = phrase.toUpperCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú","u").replace(" ","").replace(".", "").replace(", ", "");
         String invertedPhrase = new StringBuilder(phrase).reverse().toString();

         return invertedPhrase.equals(phrase);
    }
}
