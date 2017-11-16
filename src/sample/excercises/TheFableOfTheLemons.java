package sample.excercises;

/**
 * Copyright (c) Anton on 15.11.2017.
 */
public class TheFableOfTheLemons {

    int countVariants(int inText, int repeatsInARawPossible) throws IllegalArgumentException {

        if (inText < 1 || inText > 10000) {
            throw new IllegalArgumentException(" inText is out of range ");
        }

        if (repeatsInARawPossible < 0 || repeatsInARawPossible > inText) {
            throw new IllegalArgumentException(" repeatsInARawPossible is out of range ");
        }

        if (repeatsInARawPossible == 0){
            return  1;
        }


        int result = 0;

        result = (int) (Math.pow(2, inText) - Math.pow(2, (inText - repeatsInARawPossible)));

        if (inText == repeatsInARawPossible) {
            result += 1;
        }


        return result;

    }
}
