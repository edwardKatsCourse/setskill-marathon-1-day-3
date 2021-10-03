package com.company;

import java.util.Scanner;

public class SayHello {

    public static void main(String[] args) {

        while(true) {
            System.out.println("Name");
            String name = new Scanner(System.in).nextLine();
            sayHello(name);

            System.out.println("Age");
            int age = new Scanner(System.in).nextInt();
            if (age >= 0) {
                if(age <= 120) {
                    break;
                }
            }
            System.out.println("Age is unreal");

            // age
            // age 0...120 -> break
            //

        }

    }

    static void sayHello(String name) {
        System.out.println("Привет, " + name);
    }
}
