package sample.excercises;

import java.util.Scanner;


/**
 * Copyright (c) Anton on 15.11.2017.
 */

public class TheFableOfTheLemons2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inText = scanner.nextInt();
        int repeatsInARawPossible = scanner.nextInt();

        TheFableOfTheLemons2 theFableOfTheLemons2 = new TheFableOfTheLemons2();
        System.out.println(theFableOfTheLemons2.countVariants(inText, repeatsInARawPossible));


    }

    int countVariants(int inText, int repeatsInARawPossible) throws IllegalArgumentException {

        if (inText < 1 || inText > 10000) {
            throw new IllegalArgumentException(" inText is out of range ");
        }

        if (repeatsInARawPossible < 0 || repeatsInARawPossible > inText) {
            throw new IllegalArgumentException(" repeatsInARawPossible is out of range ");
        }

        if (repeatsInARawPossible == 0) {
            return 1;
        }


        int result = 0;

        for (int i = 1; i <= (inText - repeatsInARawPossible); i++) {

            result += Math.pow(2, i);

        }

        if ( (inText - repeatsInARawPossible) % 2 == 0) {
            result += 1;
        }

        result = result - (2*(inText-repeatsInARawPossible));

        result = (int) (Math.pow(2, inText) - result);
        return result;

    }


}


