package com.gmail.fomichov.m;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mfomi on 06.07.2017.
 */
public class Main_2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        int size = checkInt();
        int dataArray[] = new int[size];
        int dataArrayReverse[] = new int[dataArray.length];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива из " + size);
            dataArray[i] = checkInt();
        }

        for (int i = 0; i < dataArray.length; i++) {
            dataArrayReverse[i] = dataArray[dataArray.length - i - 1];
        }

        System.out.println("Основной массив " + Arrays.toString(dataArray));
        System.out.println("Перевернутый массив " + Arrays.toString(dataArrayReverse));

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
