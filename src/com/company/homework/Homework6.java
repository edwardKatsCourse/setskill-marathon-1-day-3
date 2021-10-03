package com.company;


import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args) {
        double price = 100.0;

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 18) {
            System.out.println("Not adult. Discount 30%");
            System.out.println("Price " + (price - (price / 100 * 30)));
        } else if(age >= 60) {
            System.out.println("Senior citizen. Discount 50%");
            System.out.println("Price " + (price - (price / 100 * 50)));
        } else {
            System.out.println("Price " + price);
        }
    }
}
