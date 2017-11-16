package sample.excercises;

import sample.chapter7.B;

import java.net.ServerSocket;
import java.util.ArrayList;

/**
 * Copyright (c) Anton on 09.11.2017.
 */
public class Sandro {

    private final static char[] upCaseAlphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private final static char[] downCaseAlphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static final int WORD_LENGTH = 6;


    int findMinPrize(String inputString) {

        if(inputString.length()< WORD_LENGTH){
            throw new IllegalArgumentException();
        }

        int index = 0;
//        int endIndex = 6;
        int minPrize = 60;
        do {
            String localSubstring = inputString.substring(index, index + WORD_LENGTH);
            int localPrize = countPrize(localSubstring);
            if (localPrize<minPrize){
                minPrize = localPrize;
            }
            index++;
//            endIndex++;
        } while (index + WORD_LENGTH <= inputString.length());
        return minPrize;
    }


    private boolean matchToUpCaseAlphabet(char letter) {
        for (char c : upCaseAlphabet) {
            if(letter==c){
                return true;
            }

        }

        return  false;
    }

    private boolean matchToDownCaseAlphabet(char letter) {
        for (char c : downCaseAlphabet) {
            if(letter==c){
                return true;
            }

        }

        return  false;
    }


    private int countPrize(String localSubstring) {
        char[] letters = localSubstring.toCharArray();
        int prize = 0;

        if (letters[0] != 'S') {
            if (letters[0] == 's' || matchToUpCaseAlphabet(letters[0])) {
                prize += 5;
            } else {
                prize += 10;
            }
        }

        if (letters[1] != 'a') {
            if (letters[1] == 'A' || matchToDownCaseAlphabet(letters[1])) {
                prize += 5;
            } else {
                prize += 10;
            }
        }

        if (letters[2] != 'n') {
            if (letters[2] == 'N' || matchToDownCaseAlphabet(letters[2])) {
                prize += 5;
            } else {
                prize += 10;
            }
        }

        if (letters[3] != 'd') {
            if (letters[3] == 'D' || matchToDownCaseAlphabet(letters[3])) {
                prize += 5;
            } else {
                prize += 10;
            }
        }

        if (letters[4] != 'r') {
            if (letters[4] == 'R' || matchToDownCaseAlphabet(letters[4])) {
                prize += 5;
            } else {
                prize += 10;
            }
        }

        if (letters[5] != 'o') {
            if (letters[5] == 'O' || matchToDownCaseAlphabet(letters[5])) {
                prize += 5;
            } else {
                prize += 10;
            }
        }

        return prize;
    }
}

