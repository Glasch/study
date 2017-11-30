package sample.excercises;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Copyright (c) Anton on 30.11.2017.
 */
public class TheFableOfTheLemons3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeatsInRowPossible = scanner.nextInt();
        int inText = scanner.nextInt();

        TheFableOfTheLemons3 thaFableOfTheLemons3 = new TheFableOfTheLemons3(repeatsInRowPossible, inText);
        System.out.println(thaFableOfTheLemons3.countVariants());


    }

    private int repeatsInRowPossible;
    private int inText;

    public TheFableOfTheLemons3(int inText, int repeatsInRowPossible) {
        this.repeatsInRowPossible = repeatsInRowPossible;
        this.inText = inText;
    }

    public BigInteger countVariants() {
        BigInteger illegal = BigInteger.ZERO;
        for (int i = repeatsInRowPossible + 1; i <= inText; i++) {
            illegal = illegal.add(countIllegalVariants(inText, i));
        }
        BigInteger all = BigInteger.valueOf(2).pow(inText);
        return all.subtract(illegal);
    }

    private BigInteger countIllegalVariants(int inText, int wordLength) {
        if(inText == wordLength){
            return BigInteger.ONE;
        }
        BigInteger count = BigInteger.ZERO;
        for (int i = 0; i <= inText - wordLength; i++) {
            BigInteger left = calcLeftOptions(i);
            BigInteger right = calcRightOptions(inText, i, wordLength);

            count = count.add(left.multiply(right));
        }
        return count;
    }

//    private BigInteger countPlacementsIgnoreRepeats(int inText_sub, int wordLength) {
//        if (wordLength>inText_sub){
//            return BigInteger.ZERO;
//        }
//        BigInteger tech = BigInteger.valueOf(inText_sub - wordLength + 1);
//       // try {
//            return BigInteger.valueOf(2).pow(inText_sub - wordLength).multiply(tech);
//        //} catch (Exception e) {
//        //    throw new IllegalStateException(e);
//       // }
//    }

    private BigInteger calcLeftOptions(int indexStartOfWord) {
        return __calcOptions(indexStartOfWord-1, false);
    }

    private BigInteger calcRightOptions(int inText, int indexStartOfWord, int wordLength) {

        int tailLength = inText - indexStartOfWord - wordLength;
        boolean ignoreInvalid = wordLength == repeatsInRowPossible+1;
        return __calcOptions(tailLength - 1, ignoreInvalid);
    }

    private BigInteger __calcOptions(int tailLength, boolean ignoreInvalid) {
        if (tailLength <= 0) {
            return BigInteger.ONE;
        }
        BigInteger totalOptions = BigInteger.valueOf(2).pow(tailLength);
        if(ignoreInvalid){
            return totalOptions;
        }

        BigInteger invalidOptions =  countIllegalVariants(tailLength, repeatsInRowPossible + 1);
        return totalOptions.subtract(invalidOptions);
    }


}


