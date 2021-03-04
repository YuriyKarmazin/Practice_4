package com.project;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // The first task
        // The first solution for task one
        int reverseNumber = 123456;
        while (reverseNumber > 0){
            System.out.print(reverseNumber % 10);
            reverseNumber /= 10;
        }
        System.out.println();

        // The second solution for task one
        int reverseNumberTwo = 123456;
        String string = Integer.toString(reverseNumberTwo);
        char[] arrayOfChar = string.toCharArray();
        System.out.println();

        for (int i = arrayOfChar.length; i > 0; i--) {
            System.out.print((arrayOfChar[i - 1]));
        }
        System.out.println();

        // The second task
        int[] array = new int[100];
        int minNumber = array[0];
        int maxNumber = array[0];

        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println();

        System.out.println(Arrays.toString(array));
        System.out.println();

        for (int i = 1; i < 100; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.println("The Minimum number is - " + minNumber);
        System.out.println();

        System.out.println("The Maximum number is - " + maxNumber);
        System.out.println();

        double sum = minNumber + maxNumber;
        double averageNumber = sum / 2;
        System.out.println("The Average is - " + averageNumber);
    }
}
