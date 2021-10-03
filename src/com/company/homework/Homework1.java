package com.company;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        printName();
        printYear();
        printAddress();
    }

    static void printName() {
        System.out.println("Enter your name: ");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Enter your last name: ");
        String lastName = new Scanner(System.in).nextLine();

        System.out.println("Enter your father name:");
        String fatherName = new Scanner(System.in).nextLine();

        String fullName = name + " " + lastName + " " + fatherName;
        System.out.println("ФИО: " + fullName);
    }

    static void printAddress() {
        System.out.println("Enter your city: ");
        String city = new Scanner(System.in).nextLine();

        System.out.println("Enter your country: ");
        String country = new Scanner(System.in).nextLine();

        String fullAddress = city + " " + country;
        System.out.println("Адрес проживания: " + fullAddress);
    }

    static void printYear() {
        System.out.println("Enter year of birth: ");
        int year = new Scanner(System.in).nextInt();

        System.out.println("год рождения: " + year);
    }
}
