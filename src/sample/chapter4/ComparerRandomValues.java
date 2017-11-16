package sample.chapter4;

import java.util.Random;

/**
 * Copyright (c) Anton on 12.06.2017.
 */
class ComparerRandomValues {
    static void randomazys(long seed) {
        Random rnd = new Random(seed);
        for (int i = 0; i < 25; i++) {
            int a = rnd.nextInt();
            int b = rnd.nextInt();
            if (a > b) {
                System.out.println(a + " больше " + b);
            } else {
                if (a == b) {
                    System.out.println(a + " равно " + b);
                }
                else {
                    System.out.println(a + " меньше " + b);
                }
            }

        }
    }

    static void randomazysEndless(long seed) {
        Random rnd = new Random(seed);
        while (true) {
            int a = rnd.nextInt();
            int b = rnd.nextInt();
            if (a > b) {
                System.out.println(a + " больше " + b);
            } else {
                if (a == b) {
                    System.out.println(a + " равно " + b);
                }
                else {
                    System.out.println(a + " меньше " + b);
                }
            }

        }
    }
}
