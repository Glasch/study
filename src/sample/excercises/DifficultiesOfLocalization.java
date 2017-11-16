package sample.excercises;

import java.util.Scanner;

/**
 * Copyright (c) Anton on 08.11.2017.
 */
public class DifficultiesOfLocalization {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String s = localization(x);
        System.out.println(s);
        System.out.flush();
    }

   static String localization(int number) {
        String s=null;
        if (number < 1) {
            s = "Введено не корректное значение!";
        } else if (number >= 1 && number < 5) {
            s = "few";
        } else if (number >= 5 && number < 10) {
            s = "several";
        } else if (number > 9 && number < 20) {
            s = "pack";
        } else if (number > 19 && number < 50) {
            s = "lots";
        } else if (number > 49 && number < 100) {
            s = "horde";
        } else if (number > 99 && number < 250) {
            s = "throng";
        } else if (number > 249 && number < 500) {
            s = "swarm";
        } else if (number > 499 && number < 1000) {
            s = "zounds";
        } else if (number > 999) {
            s = "legion";
        }
        return s;

    }


}
