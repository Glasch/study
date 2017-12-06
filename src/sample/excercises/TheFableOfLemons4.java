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
        powers = new BigInteger[inText+1];
        legalOptionsCount = new BigInteger[inText+1];
        this.repeatsInRowPossible = repeatsInRowPossible;
        return countLegal(inText);
    }

    private BigInteger countLegal(int inText) {
        if(inText <= 0){
            return BigInteger.ONE;
        }
        BigInteger cached = legalOptionsCount[inText];
        if(cached != null){
            return cached;
        }

        BigInteger all = power(inText);
        BigInteger illegal = countIllegal(inText);
        BigInteger res = all.subtract(illegal);
        legalOptionsCount[inText] = res;
        return res;
    }

    private BigInteger countIllegal(int inText) {
        if(inText < repeatsInRowPossible+1){
            return BigInteger.ZERO;
        }

        BigInteger illegal = BigInteger.ZERO;
        for(int i = 0; i <= inText-repeatsInRowPossible-1; i++){
            BigInteger right = power(i);
            BigInteger left = countLegal(inText-i-repeatsInRowPossible-2);
            illegal = illegal.add(right.multiply(left));
        }

        return illegal;
    }

    private BigInteger power(int i) {
        if(powers[i] == null){
            powers[i] = TWO.pow(i);
        }
        return powers[i];
    }
}
