package sample.chapter13;

import java.util.Arrays;
import java.util.List;

/**
 * Copyright (c) Anton on 02.11.2017.
 */
public class SimpleBubleSortArray {

    void simpleBubleSortArray(List<Integer> list) {

        Integer[] array = list.toArray(new Integer[0]);

        boolean haveswap = false;
        int k = array.length-1;
        int countSwaps = 0;

        do {
            haveswap = false;
            for (int i = 0; i < k; i++) {
                if (array[i+1] < array[i]) {
                    swap(array, i, i + 1);
                    countSwaps++;
                    haveswap = true;
                }
            }
            k--;

        } while (haveswap);
        System.out.println("countSwaps = " + countSwaps);
        for (int i = 0; i < array.length; i++) {
            list.set(i,array[i]);
        }
    }

    private void swap(Integer[] array, int i, int j) {
        int tech = array[i];
        array[i] = array[j];
        array[j] = tech;
    }



}


