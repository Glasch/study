package sample.excercises;

import java.math.BigInteger;

/*
 * Copyright (c) 2016 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.

 * Author: glaschenko
 * Created: 06.12.2017
 */
public class TheFableOfLemons4 {
    public static final BigInteger TWO = BigInteger.valueOf(2);
    private int repeatsInRowPossible;

    private BigInteger[] legalOptionsCount;
    private BigInteger[] powers;

    public BigInteger countVariants(int inText, int repeatsInRowPossible) {
        powers = new BigInteger[inText + 1];
        legalOptionsCount = new BigInteger[inText + 1];
        this.repeatsInRowPossible = repeatsInRowPossible;
        //fill cache
        powers[0] = BigInteger.ONE;
        System.out.println("powers cache");
        for (int i = 1; i < inText + 1; i++) {
            powers[i] = powers[i - 1].multiply(TWO);
        }

        System.out.println("results cache");
        for (int i = 0; i < inText; i++) {
            countLegal2(i);
        }

        System.out.println("start count");
        //count
        return countLegal2(inText);
    }

    private BigInteger countLegal2(int inText) {
        BigInteger res = powers[inText];
        if (inText >= repeatsInRowPossible) {
            BigInteger illegal = countIllegal2(inText);
            res = res.subtract(illegal);
        }
        legalOptionsCount[inText] = res;
        return res;
    }

    private BigInteger countIllegal2(int inText) {
        BigInteger illegal = BigInteger.ZERO;
        for (int i = 0; i <= inText - repeatsInRowPossible - 1; i++) {
            BigInteger right = powers[i];
            int index = inText - repeatsInRowPossible - 2 - i;
            BigInteger left = index <= 0 ? BigInteger.ONE : legalOptionsCount[index];
            illegal = illegal.add(right.multiply(left));
        }
        return illegal;
    }

//    private BigInteger countLegal(int inText) {
//        if (inText <= 0) {
//            return BigInteger.ONE;
//        }
//        BigInteger cached = legalOptionsCount[inText];
//        if (cached != null) {
//            return cached;
//        }
//
//        BigInteger all = powers[inText];
//        BigInteger illegal = countIllegal(inText);
//        BigInteger res = all.subtract(illegal);
//        legalOptionsCount[inText] = res;
//        return res;
//    }


//    private BigInteger countIllegal(int inText) {
//        if (inText < repeatsInRowPossible + 1) {
//            return BigInteger.ZERO;
//        }
//
//        BigInteger illegal = BigInteger.ZERO;
//        for (int i = 0; i <= inText - repeatsInRowPossible - 1; i++) {
//            BigInteger right = powers[i];
//            BigInteger left = countLegal(inText - i - repeatsInRowPossible - 2);
//            illegal = illegal.add(right.multiply(left));
//        }
//
//        return illegal;
//    }
//
//    private BigInteger power(int i) {
//        if(powers[i] == null){
//            powers[i] = TWO.pow(i);
//        }
//        return powers[i];
//    }
}
