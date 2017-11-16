package sample.recursive;

import java.util.ArrayList;

/**
 * Copyright (c) Anton on 02.11.2017.
 */
public class DihotomicSearch {

    boolean hasValue(ArrayList <Integer> list, int toFind) {

        for (Integer integer : list) {
            if (toFind == integer) {
                return true;
            }
        }
        return false;
    }

    boolean hasValueD(ArrayList <Integer> list, int toFind) {
        int start = 0;
        int end = list.size() - 1;


        while (end >= start) {

            int mid = (start + end) / 2;
            if (list.get(mid) == toFind) {
                return true;
            }
            if (list.get(mid) > toFind) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

    boolean hasValueDRecursive(ArrayList <Integer> list, int toFind) {
        return hasValueDRecursive(list, toFind, 0, list.size() - 1);
    }

    private boolean hasValueDRecursive(ArrayList <Integer> list, int toFind, int start, int end) {

        if (end < start) {
            return false;
        }

        int mid = (start + end) / 2;

        if (list.get(mid) == toFind) {
            return true;
        }
        if (list.get(mid) == toFind) {
            return true;
        }
        if (list.get(mid) > toFind) {
            return hasValueDRecursive(list, toFind, start, mid - 1);
        } else {
            return hasValueDRecursive(list, toFind, mid + 1, end);
        }


    }

}
