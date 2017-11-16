package sample.chapter13;

import java.util.ArrayList;
import java.util.Random;

/**
 * Copyright (c) Anton on 24.10.2017.
 */
public class ToSort {

    Random random = new Random(2345);
    public ArrayList <Integer> arrayListToSort = new ArrayList <>();

   public  ArrayList <Integer> addToArray(int sizeOfArray, ArrayList <Integer> arrayListToSort) {
        while (arrayListToSort.size() < sizeOfArray) {
            arrayListToSort.add(random.nextInt(100));
            arrayListToSort.iterator().next();
        }
        return arrayListToSort;
    }

  public  boolean checkSort() {

        for (int i = 0; i < arrayListToSort.size() - 1; i++) {
            if (arrayListToSort.get(i) > arrayListToSort.get(i + 1)) {
                return false;

            }
        }
        return true;
    }
}
