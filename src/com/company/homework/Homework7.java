package com.company.homework;

import java.util.Scanner;

public class Homework7 {

    static void println(String value){}

    public static void main(String[] args) {



        // +, -, *, /
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        int option = new Scanner(System.in).nextInt();

        if (option == 1) {
            // sum
            sum();
        } else if (option == 2) {
            // subtraction
            subtract();
        } else if (option == 3) {
            // multiplication
            multiply();
        } else if (option == 4){
            // division
            divide();
        }
    }

    static void sum() {
        System.out.println("Enter first digit: ");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Enter second digit: ");
        int b = new Scanner(System.in).nextInt();

        // abc + 123 = abc123
        // "1" + 1 = 11
        // result + 2 + 2 = result (4)
        System.out.println("Result: " + (a + b));
    }

    // вычесть
    static void subtract() {
        System.out.println("Enter first digit: ");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Enter second digit: ");
        int b = new Scanner(System.in).nextInt();

        System.out.println("Result: " + (a - b));
    }

    static void multiply() {
        System.out.println("Enter first digit: ");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Enter second digit: ");
        int b = new Scanner(System.in).nextInt();

        System.out.println("Result: " + (a * b));
    }

    static void divide() {
        System.out.println("Enter first digit: ");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Enter second digit: ");
        int b = new Scanner(System.in).nextInt();

        if(b == 0) {
            System.out.println("You cannot divide by ZERO");
        } else {
            System.out.println("Result: " + (a / b));
        }


    }
}
