package com.gmail.fomichov.m;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mfomi on 07.07.2017.
 */
public class Main_4 {
    public static void main(String[] args) {
//        System.out.println("Введите размер массива");
//        int size = checkInt();
//        int dataArray[] = new int[size];
        int data[] = {1, 2, 3, 4, 5};
//        for (int i = 0; i < size; i++) {
//            System.out.println("Введите " + (i + 1) + " элемент массива из " + size);
//            dataArray[i] = checkInt();
//        }

        for (int i = data.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(data));


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

