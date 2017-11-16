package sample.chapter13;

import java.util.ArrayList;

/**
 * Copyright (c) Anton on 02.11.2017.
 */
public class SimpleBubleSort {

    ArrayList<Integer> simpleBubleSort(ArrayList <Integer> list) {

        boolean haveswap = false;
        int k = list.size()-1;
        int countSwaps = 0;

        do {
            haveswap = false;
            for (int i = 0; i < k; i++) {
                if (list.get(i + 1) < list.get(i)) {
                    try {
                        swap(list, i, i + 1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    countSwaps++;
                    haveswap = true;
                }
            }
            k--;

        } while (haveswap);
        System.out.println("countSwaps = " + countSwaps);
        return list;
    }

    private void swap(ArrayList <Integer> list, int i, int j) {
        int tech = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tech);
        }



}
