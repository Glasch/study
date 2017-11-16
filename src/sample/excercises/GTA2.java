package sample.excercises;

import java.util.Scanner;

/**
 * Copyright (c) Anton on 09.11.2017.
 */

public class GTA2 {


    private int firstPlayerValue = 0;
    private int secondPlayerValue = 0;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nextLine = in.nextLine();
        int[] ints = parseIntLine(nextLine, 1);
        int length = ints[0];

        nextLine = in.nextLine();
        int[] srcArray = parseIntLine(nextLine, length);

        nextLine = in.nextLine();
        ints = parseIntLine(nextLine, 2);

        GTA2 gta2 = new GTA2();
        gta2.playGTA2(ints[0], ints[1], srcArray);
        System.out.printf("%d %d", gta2.getFirstPlayerValue(), gta2.getSecondPlayerValue());
    }


    void playGTA2(int firstIndex, int secondIndex, int[] array) {

        boolean specialCondition = false;

        if ((Math.abs(firstIndex - secondIndex) == 1)) {
            specialCondition = true;
        }
        else if (firstIndex == 0 || secondIndex == 0) {
            specialCondition = true;
        }
        else if (firstIndex == (array.length - 1) || secondIndex == (array.length - 1)) {
            specialCondition = true;
        }

        int middle = (firstIndex + secondIndex) / 2;
        if (Math.abs(firstIndex - secondIndex) % 2 != 0 && (!specialCondition)) {
            if (firstIndex < secondIndex) {
                middle += 1;
            }
        }

        int leftSum = sumArray(array, 0, middle + 1);
        int rightSum = sumArray(array, middle + 1, array.length);

        if (firstIndex == secondIndex) {
            leftSum -= array[middle];
            if (leftSum > rightSum) {
                firstPlayerValue = leftSum + array[middle];
                secondPlayerValue = rightSum;
            } else {
                firstPlayerValue = rightSum + array[middle];
                secondPlayerValue = leftSum;
            }

        } else {
            if (firstIndex > secondIndex) {
                firstPlayerValue = rightSum;
                secondPlayerValue = leftSum;
            } else {
                firstPlayerValue = leftSum;
                secondPlayerValue = rightSum;

            }

        }

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

    static int[] parseIntLine(String line, int count) {
        String[] intStrings = line.split(" ");
        int[] resultArray = new int[count];
        int i = 0;
        for (String each : intStrings) {
            if (i == count) break;
            resultArray[i++] = Integer.parseInt(each);
        }
        return resultArray;
    }
}
