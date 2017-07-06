package com.gmail.fomichov.m;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, temp;
        System.out.println("Введите первое число:");
        a = checkInt();
        System.out.println("Введите второе число:");
        b = checkInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);


    }

    // проверяем на целое число
    private static int checkInt() {
        Scanner sc = new Scanner(System.in);
        int value;
        while (true) {
            try {
                value = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Только целое число!");
                sc.nextLine();
            }
        }
        return value;
    }

}
