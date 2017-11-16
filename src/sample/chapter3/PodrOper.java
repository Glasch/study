package sample.chapter3;

/**
 * Copyright (c) Anton on 11.06.2017.
 */
/* Ex. 10 p. 110 */
public class PodrOper {
    private final static int A = 0xAAAA;
    private final static int B = 0x5555;

    static void compareNumbers() {
        System.out.println("A = " + Integer.toBinaryString(A));
        System.out.println("B = " + Integer.toBinaryString(B));
        int c = A & B;
        System.out.println("c = " + c);
        int d = A | B;
        System.out.println("d = " + Integer.toBinaryString(d));
        int e = A ^ B;
        System.out.println("e = " + Integer.toBinaryString(e));
        int x = ~A;
        System.out.println("x = " + Integer.toBinaryString(x));


    }

    public static String intToBinary(int inputNumber) {
        int p = 0;
        while (Math.pow(2, p) < inputNumber) {
            p++;
        }
        int digit = (int) Math.pow(2, p - 1);
        //System.out.println("digit = " + digit);
        StringBuilder result = new StringBuilder();
        while (inputNumber > 0) {
            if (inputNumber >= digit) {
                result.append("1");
                inputNumber -= digit;
            } else {
                result.append("0");
            }
            digit /= 2;

        }
        return result.toString();

    }

     static String intToBinary2(int inputNumber) {
        int digit = 1;
        while (digit < inputNumber) {
            digit *= 2;
        }
        digit /= 2;
        System.out.println("digit = " + digit);
        return null;

    }

}


