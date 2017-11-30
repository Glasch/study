package sample.excercises;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Copyright (c) Anton on 15.11.2017.
 */
public class TheFableOfTheLemons {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inText = scanner.nextInt();
        int repeatsInARawPossible = scanner.nextInt();

        TheFableOfTheLemons theFableOfTheLemons = new TheFableOfTheLemons();
        System.out.println(theFableOfTheLemons.countVariants(inText, repeatsInARawPossible));


    }

    BigInteger countVariants(int inText, int repeatsInARawPossible) {

        if (repeatsInARawPossible == 0) {
            return BigInteger.valueOf(1);
        }


        BigInteger result;
        BigInteger first = BigInteger.valueOf(2).pow(inText);

        BigInteger repeats = countRepeats(inText, repeatsInARawPossible);


        BigInteger second = BigInteger.valueOf(2).pow(inText - repeatsInARawPossible);

        result = first.subtract(second).subtract(repeats);

        result = result.add(BigInteger.ONE);

        return result;

    }

    private BigInteger countRepeats(int inText, int repeatsInaRawPossible) {
        int repeats = 0;
        int n = inText - repeatsInaRawPossible;
        int nFactor = 1;
        for (int i = 1; i <= n; i++) {
            nFactor = nFactor * i;
        }


        int k;

        for (int j = 2; j < n; j++) {
            k = j;
            int kFactor = 1;
            for (int z = 1; z <= k; z++) {
                kFactor = kFactor * z;
            }
            int sub = n - k;
            int subFactor = 1;
            for (int x = 1; x <= sub; x++) {
                subFactor = subFactor * x;
            }

            int allVariants = nFactor / ((subFactor) * (kFactor));
            int noRepeats = n - j + 1;

            repeats = repeats + (allVariants - noRepeats);
        }


        return BigInteger.valueOf(repeats);
    }


}


