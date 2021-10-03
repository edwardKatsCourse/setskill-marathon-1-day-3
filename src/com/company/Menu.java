package com.company;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        // Меню
        // 1. Поздороваться
        // 2. Как дела?
        // exit - выйти из программы

        while (true) {
            System.out.println("1. Здороваемся");
            System.out.println("2. Как дела? ");
            String option = new Scanner(System.in).nextLine();
            if (option.equals("exit")) {
                break;
            } else if (option.equals("1")) {

            } else if (option.equals("2")) {

            }
        }

        int i;      // primitive ==
        String s;   // Object    .equals()

        String databaseEmail = "abc@site.com";

        System.out.println("Введите ваш емайл");
        String email = new Scanner(System.in).nextLine();

        System.out.println(databaseEmail == email);
        System.out.println(databaseEmail.equals(email));

    }
}
