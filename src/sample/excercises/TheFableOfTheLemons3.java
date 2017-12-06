package sample.excercises;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Copyright (c) Anton on 30.11.2017.
 */
public class TheFableOfTheLemons3 {

    public static final BigInteger TWO = BigInteger.valueOf(2);
    private int repeatsInRowPossible;

    private HashMap<Long, BigInteger> optionsCache = new HashMap<>(1000000);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeatsInRowPossible = scanner.nextInt();
        int inText = scanner.nextInt();

        TheFableOfTheLemons3 thaFableOfTheLemons3 = new TheFableOfTheLemons3();
        System.out.println(thaFableOfTheLemons3.countVariants(repeatsInRowPossible, inText));
        System.out.println(Runtime.getRuntime().totalMemory());

    }

    public BigInteger countVariants(int inText, int repeatsInRowPossible) {
        this.repeatsInRowPossible = repeatsInRowPossible;
        return countVariants(inText, repeatsInRowPossible+1,inText);
    }

    private BigInteger countVariants(int inText, int minK, int maxK) {
        if (inText <= 0) {
            return BigInteger.ONE;
        }
        BigInteger illegal = BigInteger.ZERO;
        for (int i = minK; i <= maxK; i++) {
            illegal = illegal.add(countIllegalVariants(inText, i));
        }
        BigInteger all = TWO.pow(inText);
        return all.subtract(illegal);
    }

    private BigInteger countIllegalVariants(int inText, int wordLength) {
        BigInteger cached = optionsCache.get((long)inText * 10000 + wordLength);
        if(cached != null){
            return cached;
        }
        if(inText == wordLength){
            return BigInteger.ONE;
        }
        BigInteger count = BigInteger.ZERO;
        for (int i = 0; i <= inText - wordLength; i++) {
            count = count.add(countIllegalVariantForIndex(inText, wordLength, i));
        }
        optionsCache.put((long)inText * 10000 + wordLength, count);
        return count;
    }

    public BigInteger countIllegalVariantForIndex(int inText, int wordLength, int i) {
        BigInteger left = countVariants(i-1, repeatsInRowPossible+1, wordLength-1);

        int tailLength = inText - i - wordLength;
        BigInteger right = countVariants(tailLength-1,repeatsInRowPossible+1, wordLength);
        return left.multiply(right);
    }

    public BigInteger countIllegalVariantForIndexEXP(int inText, int wordLength, int i) {
        BigInteger left = countVariants(i-1, repeatsInRowPossible+1, wordLength-1);

        int tailLength = inText - i - wordLength;
        BigInteger right = countVariants(tailLength-1,repeatsInRowPossible+1, wordLength-1);
        return left.multiply(right);
    }



}




