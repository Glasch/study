package sample.excercises;

import java.util.Scanner;

/**
 * Copyright (c) Anton on 21.11.2017.
 */
public class GTA3 {

    private int firstPlayerValue = 0;
    private int secondPlayerValue = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int charSize = scanner.nextInt();

        int[] array = new int[charSize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int firstIndex = scanner.nextInt() - 1;

        int secondIndex = scanner.nextInt() - 1;

        GTA3 gta3 = new GTA3();
        gta3.playGTA3(firstIndex, secondIndex, array);

    }

    void playGTA3(int firstIndex, int secondIndex, int[] array) {

        int middle;
        int inPlay = sumArray(array, 0, array.length);

        if (firstIndex != secondIndex) {

            middle = (firstIndex + secondIndex) / 2;

            boolean distanceEven = true;
            if (firstIndex % 2 == 0 && secondIndex % 2 == 0) {
                distanceEven = false;
            }
            if (firstIndex % 2 != 0 && secondIndex % 2 != 0) {
                distanceEven = false;
            }

            if (firstIndex > secondIndex && !distanceEven) {
                middle = middle - 1;

            }

            if (firstIndex > secondIndex) {
                firstPlayerValue = sumArray(array, middle + 1, array.length);
            } else {
                firstPlayerValue = sumArray(array, 0, middle + 1);
            }
            secondPlayerValue = inPlay - firstPlayerValue;

        } else {

            int rightSum = sumArray(array, firstIndex, array.length);
            int leftSum = sumArray(array, 0, firstIndex + 1);

            if (rightSum >= leftSum) {
                firstPlayerValue = rightSum;

            } else {
                firstPlayerValue = leftSum;

            }
            secondPlayerValue = inPlay - firstPlayerValue;
        }

        System.out.println(firstPlayerValue + " " + secondPlayerValue);

    }

    private int sumArray(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }


    public int getFirstPlayerValue() {
        return firstPlayerValue;
    }

    public int getSecondPlayerValue() {
        return secondPlayerValue;
    }


}
