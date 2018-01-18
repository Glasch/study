package sample.excercises;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Copyright (c) Anton on 07.12.2017.
 */
public class TheFableOfLemons5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        TheFableOfLemons5 theFableOfLemons5 = new TheFableOfLemons5();
        System.out.println(theFableOfLemons5.countLegalVariants(n, k));

    }

    BigInteger countLegalVariants(int n, int k) {
        BigInteger sum = BigInteger.ZERO;



        if (k == 1) {
            sum = findFiboNumbers(100,n) ;
            return sum;

        }

        for (int i = 1; i <= k; i++) {
            BigInteger count = BigInteger.valueOf(2).pow(n - i);
            sum = sum.add(count);

        }


        return sum;
    }


    static BigInteger findFiboNumbers(int howMuchNumbers, int n) {
        ArrayList <BigInteger> res = new ArrayList <>();
        BigInteger firstNumber = BigInteger.ZERO;
        BigInteger secondNumber = BigInteger.ONE;
        res.add(secondNumber);
        for (int i = 1; i <= howMuchNumbers - 1; i++) {
            BigInteger d = firstNumber.add(secondNumber);
            res.add(d);
            firstNumber = secondNumber;
            secondNumber = d;
        }


        return res.get(n+1);


    }
}
