package sample.recursive;

import junit.framework.TestCase;
import sample.chapter13.ToSort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Copyright (c) Anton on 02.11.2017.
 */
public class TestRecursive extends TestCase {

    public void testDihotomicSearch(){
        DihotomicSearch dihotomicSearch = new DihotomicSearch();
        ArrayList<Integer> arrayList = new ArrayList <>();
       arrayList.add(5);
       arrayList.add(4);
       arrayList.add(3);
       arrayList.add(2);
       arrayList.add(1);
       boolean test = dihotomicSearch.hasValue(arrayList,15);
       assertEquals(false, test);


    }

    public void testDihotomicSearchNew(){
        DihotomicSearch dihotomicSearch = new DihotomicSearch();
        ToSort toSort = new ToSort();
        toSort.addToArray(2, toSort.arrayListToSort);
        int testVal = 5000000;
        toSort.arrayListToSort.add(testVal);
        Collections.sort(toSort.arrayListToSort);
        assertTrue(toSort.checkSort());
        long before = System.currentTimeMillis();
        boolean hasValueD = dihotomicSearch.hasValueDRecursive(toSort.arrayListToSort, testVal);
        long after = System.currentTimeMillis();
        System.out.println("Duration = " + (after - before) + " ms");
        assertTrue(hasValueD);




    }
}
