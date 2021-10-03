package com.company.homework;

import java.util.Locale;
import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        System.out.println("Введите вашу зарплату: ");

        // 32,2
        // 32.2
        double baseSalary = new Scanner(System.in).useLocale(Locale.US).nextDouble();

        System.out.println("Введите ваш бонус: ");
        int bonus = new Scanner(System.in).nextInt();

        System.out.println("ЗП + бонус = " + (baseSalary + (baseSalary / 100 * bonus)));
    }
}
