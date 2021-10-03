package com.company;

import java.util.Scanner;

public class NewCalculator {

    public static void main(String[] args) {
//        sum("Intellij");

        System.out.println("First digit");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Second digit");
        int b = new Scanner(System.in).nextInt();

        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        int option = new Scanner(System.in).nextInt();

        if (option == 1) {
            // sum
            sum(a, b);
        } else if (option == 2) {
            // subtraction
            subtract(a ,b);
        } else if (option == 3) {
            // multiplication
            multiply(a, b);
        } else if (option == 4){
            // division
            divide(a, b);
        }

    }

    static void sum(int a, int b) {
        System.out.println("Result: " + (a + b));
    }

    static void subtract(int a, int b) {
        System.out.println("Result: " + (a - b));
    }

    static void multiply(int a, int b) {
        System.out.println("Result: " + (a * b));
    }

    static void divide(int a, int b) {
        System.out.println("Result: " + (a / b));
    }

}
