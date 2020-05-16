package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);

        }

        System.out.println(Arrays.toString(array));

        int max = array[0];
        int t, a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                a = i;
            }
        }
        t = array[0];
        array[0] = max;
        array[a] = t;

        System.out.println(Arrays.toString(array));
    }
}

