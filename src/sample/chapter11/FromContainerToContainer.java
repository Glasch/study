package sample.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Copyright (c) Anton on 27.09.2017.
 */
public class FromContainerToContainer {
    List <Integer> integerListFirst = new ArrayList <>(5);

    {
        integerListFirst.add(0, 100);
        integerListFirst.add(1, 200);
        integerListFirst.add(2, 300);
        integerListFirst.add(3, 400);
        integerListFirst.add(4, 500);
        integerListFirst.add(5, 600);
        integerListFirst.add(6, 700);

    }

    List <Integer> integerListSecond = new ArrayList <>(5);

    void fromFirstToSecond() {
        int k = 0;
        int i = integerListFirst.size()-1;
        while (integerListFirst.listIterator(i).hasPrevious()){
        integerListSecond.add(k,integerListFirst.get(i));
        k++;
        i--;
        }
        integerListSecond.add(integerListSecond.size(),integerListFirst.get(0));
        System.out.println(integerListSecond);

    }
}
