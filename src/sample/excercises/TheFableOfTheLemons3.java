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

//    private int repeatsInRowPossible;
//    private int inText;
//
//    public TheFableOfTheLemons3() {
//        this.repeatsInRowPossible = repeatsInRowPossible;
//        this.inText = inText;
//    }

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
            BigInteger left = countVariants(i-1, repeatsInRowPossible+1, wordLength-1);

            int tailLength = inText - i - wordLength;
            BigInteger right = countVariants(tailLength-1,repeatsInRowPossible+1, wordLength);
            count = count.add(left.multiply(right));
        }
        optionsCache.put((long)inText * 10000 + wordLength, count);
        return count;
    }

//    private BigInteger calcLeftOptions(int indexStartOfWord, int wordLength) {
//        return countVariants(indexStartOfWord-1,repeatsInRowPossible+1, wordLength-1);
//    }
//
//    private BigInteger calcRightOptions(int inText, int indexStartOfWord, int wordLength) {
//        int tailLength = inText - indexStartOfWord - wordLength;
//        return countVariants(tailLength-1,repeatsInRowPossible+1, wordLength);
//    }
}


