package com.gmail.fomichov.m;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mfomi on 06.07.2017.
 */
public class Main_3 {
    public static void main(String[] args) {
        System.out.println("Введите размер первого массива");
        int size1 = checkInt();
        System.out.println("Введите размер второго массива");
        int size2 = checkInt();
        int dataArray1[] = new int[size1];
        int dataArray2[] = new int[size2];
        for (int i = 0; i < size1; i++) {
            System.out.println("Введите " + (i + 1) + " элемент первого массива из " + size1);
            dataArray1[i] = checkInt();
        }

        for (int i = 0; i < size2; i++) {
            System.out.println("Введите " + (i + 1) + " элемент второго массива из " + size2);
            dataArray2[i] = checkInt();
        }

        for (int value : dataArray1) {
            System.out.print(value);
            System.out.print(" ");
        }

        System.out.println();

        for (int value : dataArray2) {
            System.out.print(value);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println("---------------");

        int maxSiseArray = 0;
        if (dataArray1.length > dataArray2.length) {
            maxSiseArray = dataArray1.length;
        } else {
            maxSiseArray = dataArray2.length;
        }

        int resultArray[] = new int[maxSiseArray];
        for (int i = 0; i < maxSiseArray; i++) {
            try {
                resultArray[i] = dataArray1[i] + dataArray2[i];
            } catch (Exception e) {
                if (maxSiseArray == dataArray1.length) {
                    resultArray[i] = dataArray1[i];
                } else {
                    resultArray[i] = dataArray2[i];
                }
            }

        }

        for (int value : resultArray) {
            System.out.print(value);
            System.out.print(" ");
        }


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

