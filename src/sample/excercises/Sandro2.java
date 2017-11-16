package sample.excercises;

/**
 * Copyright (c) Anton on 09.11.2017.
 */
public class Sandro2 {

    public static final int WORD_LENGTH = 6;
    private static final char[] pattern ={'S','a','n','d','r','o'};


    int findMinPrize(String inputString) {

        if(inputString.length()< WORD_LENGTH){
            throw new IllegalArgumentException();
        }

        int index = 0;
        int minPrize = 60;
        do {
            String localSubstring = inputString.substring(index, index + WORD_LENGTH);
            int localPrize = countPrize(localSubstring,pattern);
            if (localPrize<minPrize){
                minPrize = localPrize;
            }
            index++;
        } while (index + WORD_LENGTH <= inputString.length());
        return minPrize;
    }

    private int countPrize(String localSubstring, char[] pattern) {
        char[] letters = localSubstring.toCharArray();
        int prize = 0;

        for (int i = 0; i < pattern.length; i++) {
            char c = pattern[i];
            char lowerC = Character.toLowerCase(c);
            boolean isLowerC = c == lowerC;

            char l = letters[i];
            char lowerL = Character.toLowerCase(l);
            boolean isLowerL = l == lowerL;

            if (l != c) {
                if (lowerC == lowerL || isLowerC == isLowerL) {
                    prize += 5;
                } else {
                    prize += 10;
                }
            }

        }

        return prize;
    }
}

