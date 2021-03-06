package com.kencuevas.exercises.projectEuler;

import java.util.Scanner;

public class ProblemTwo {
    /*
    Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int serie = 0, b = 1, c, n;

        System.out.println("Please enter the number of elements for the series: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println(serie);
            c = serie + b;
            serie = b;
            b = c;
            if (c % 2 == 0){
                System.out.println("i = " + i);
            }
        }
    }
}
