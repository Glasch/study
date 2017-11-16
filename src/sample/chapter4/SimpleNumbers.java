package sample.chapter4;

/**
 * Copyright (c) Anton on 04.07.2017.
 */
/* Ex.4 p. 131 */
public class SimpleNumbers {
    static void poisk(int maxNumber) {
        boolean simple;
        for (int delimoe = 2; delimoe <= maxNumber; delimoe++) {
            simple = checkSimple(delimoe);
            if (simple) {
                System.out.println(delimoe);
            }


        }

    }

    public static boolean checkSimple(int delimoe) {
        for (int delitel = 2; delitel < delimoe; delitel++) {
            if (delimoe % delitel == 0) {
                return false;
            }
        }
        return true;
    }
}

