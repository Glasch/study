package sample.chapter12;

import sample.chapter4.SimpleNumbers;

import java.util.Random;

/**
 * Copyright (c) Anton on 12.10.2017.
 */
class FindSimple {

    int findSimple() {

        Random random = new Random();
        int randomValue = random.nextInt(1000000);
        if (!SimpleNumbers.checkSimple(randomValue)) {
            throw new IllegalStateException("Not Simple");
        }
        return randomValue;
    }

    void repeatFindSimple() {
        boolean notFound = true;
        while (notFound) {
            try {
                int simpleNumber = findSimple();
                notFound = false;
                System.out.println("simpleNumber = " + simpleNumber);
            } catch (Exception e) {
                notFound = true;
                System.out.println(e.getMessage());
            }
        }
    }

    void countSimpleNumbers(int max){
        int count = 0;
        for (int i = 3; i <= max ; i++) {
            if (SimpleNumbers.checkSimple(i)){
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.printf("Percentage: %.2f%% \n", ((double)count)/max*100);

    }
}
