package sample.excercises;

/**
 * Copyright (c) Anton on 09.11.2017.
 */
public class GTA5 {

    void playGTA5(int[] array, int firstPlayerStartIndex, int secondPlayerStartIndex) {
        int distance = secondPlayerStartIndex - (firstPlayerStartIndex + 1);
        firstCollect(distance, firstPlayerStartIndex, array);
        secondCollect(distance, secondPlayerStartIndex, array);


    }


    void lot(){

    }

    private void firstCollect(int distance, int firstPlayerStartIndex, int[] array) {

        int stepsAhead;
        if (distance % 2 == 0) {
            stepsAhead = distance / 2;
        } else {
            stepsAhead = distance / 2 + 1;
        }


        int finalIndex = firstPlayerStartIndex + stepsAhead;

        int points = 0;
        for (int i = firstPlayerStartIndex; i < (finalIndex + 1); i++) {
            points += array[i];
        }

        for (int i = (firstPlayerStartIndex - 1); i >= 0; i--) {
            points += array[i];
        }

        System.out.println(points);
    }

    private void secondCollect(int distance, int secondPlayerStartIndex, int[] array) {
        int finalIndex;
        int points = 0;
        int stepsBehind;

        stepsBehind = distance / 2;


        finalIndex = secondPlayerStartIndex - stepsBehind;

        for (int i = secondPlayerStartIndex; i > (finalIndex - 1); i--) {
            points += array[i];
        }

        for (int i = (secondPlayerStartIndex + 1); i < array.length; i++) {
            points += array[i];

        }
        System.out.println(points);

    }


}
