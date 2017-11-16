package sample.chapter13;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Copyright (c) Anton on 18.10.2017.
 */
public class TestChapter13 extends TestCase {

    public void testEx6p429() {
        ForFormat forFormat = new ForFormat();
        System.out.println(forFormat.toString());

    }

    public void testSplitting() {
        String s = "Testing.";
        System.out.println(s);
        Pattern pattern = Pattern.compile("[A-Z].*\\.$");
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches() + "\n");

        System.out.println(Splitting.knights);
        System.out.println(Arrays.toString(Splitting.knights.split("you")));
        System.out.println("\n");

        System.out.println(Splitting.knights.replaceAll("[AaEeIiOoUuYy]", "_"));
        System.out.println("\n");

        System.out.println(Splitting.javaRegExp);
        String regex = ".*n.w\\s+h([ai])s.*";
        Pattern pattern1 = Pattern.compile(regex);
        Matcher matcher1 = pattern1.matcher(Splitting.javaRegExp);
        System.out.println(matcher1.matches());
        System.out.println("regex = " + regex);
    }

    public void testEx17p446() {
        JavaParser javaParser = new JavaParser();
        try {
            String path = "test\\sample\\chapter13\\DummyEx17p446.java";
            ArrayList <String> res = javaParser.printComments(new File(path));
            for (String each : res) {
                System.out.println(each);
            }

        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public void testJavaSort() {
        ToSort toSort = new ToSort();
        toSort.addToArray(1000000, toSort.arrayListToSort);
        System.out.println(toSort.arrayListToSort);
        Collections.sort(toSort.arrayListToSort);
        System.out.println(toSort.arrayListToSort);


    }

    public void testStupidSort() {
        ToSort toSort = new ToSort();
        toSort.addToArray(10000, toSort.arrayListToSort);
        StupidSort stupidSort = new StupidSort();
        System.out.println(toSort.arrayListToSort);
        stupidSort.stupidSort(toSort.arrayListToSort);
        System.out.println(toSort.arrayListToSort);

    }

    public void testStupidWithoutBreakSort(){
        ToSort toSort = new ToSort();
        toSort.addToArray(100000, toSort.arrayListToSort);
        StupidWithoutBreakSort stupidWithoutBreakSort = new StupidWithoutBreakSort();
        System.out.println(toSort.arrayListToSort);
        stupidWithoutBreakSort.stupidWithoutBreakSort(toSort.arrayListToSort);
        System.out.println(toSort.arrayListToSort);
    }

    public void testSimpleBubleSort(){
        ToSort toSort = new ToSort();
        toSort.addToArray(100000, toSort.arrayListToSort);
        SimpleBubleSort simpleBubleSort = new SimpleBubleSort();
        System.out.println(toSort.arrayListToSort);
        simpleBubleSort.simpleBubleSort(toSort.arrayListToSort);
        System.out.println(toSort.arrayListToSort);

    }

    public void testShakeBubleSort(){
        ToSort toSort = new ToSort();
        toSort.addToArray(10,toSort.arrayListToSort);
        ShakeBubleSort shakeBubleSort = new ShakeBubleSort();
        System.out.println(toSort.arrayListToSort);
        shakeBubleSort.shakeBubleSort(toSort.arrayListToSort);
        System.out.println(toSort.arrayListToSort );
    }

    public void testSimpleBubleSortArray(){
        ToSort toSort = new ToSort();
        toSort.addToArray(10,toSort.arrayListToSort);
        SimpleBubleSortArray simpleBubleSortArray = new SimpleBubleSortArray();
        System.out.println(toSort.arrayListToSort);
        long before = System.currentTimeMillis();
        simpleBubleSortArray.simpleBubleSortArray(toSort.arrayListToSort);
        long after = System.currentTimeMillis();
        System.out.println("Duration = " + (after - before) + " ms");
        System.out.println(toSort.arrayListToSort);
        assertTrue("Array is not sorted!",toSort.checkSort());

    }


}
