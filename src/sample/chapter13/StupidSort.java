package sample.chapter13;

import java.util.ArrayList;

/**
 * Copyright (c) Anton on 24.10.2017.
 */
public class StupidSort {

    ArrayList <Integer> stupidSort(ArrayList <Integer> list) {

        boolean haveswap;

        do {
            haveswap = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i + 1) < list.get(i)) {
                    swap(list, i, i + 1);
                    haveswap = true;
                    break;

                }
            }
        } while (haveswap);
        return list;
    }

    private void swap(ArrayList <Integer> list, int i, int j) {
        int tech = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tech);
    }

}



