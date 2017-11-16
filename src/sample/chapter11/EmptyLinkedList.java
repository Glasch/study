package sample.chapter11;

import java.util.LinkedList;
import java.util.Random;

/**
 * Copyright (c) Anton on 27.09.2017.
 */
public class EmptyLinkedList {
    LinkedList <Integer> linkedList = new LinkedList <>();
    Random random = new Random();
    int k = 0;

    void addToEmtyinMiddle(int i) {
        while (linkedList.size() + 1 <= i) {
            linkedList.add(linkedList.size() / 2, k);
            System.out.println(linkedList);
            k = k + 2;
        }
        // linkedList.listIterator().next();

    }
}
