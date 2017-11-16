package sample.chapter12;

import junit.framework.TestCase;

/**
 * Copyright (c) Anton on 04.10.2017.
 */
public class TestChapter12 extends TestCase {

    public void testEx1p372() {
        TestMyException testMyException = new TestMyException();
        try {
            testMyException.whenMyException();
        } catch (MyException e) {
            System.out.println(e);
        }
        TestMyException testMyException1 = new TestMyException();
        try {
            testMyException1.whenMyExceptionNotThrowed();
        } catch (MyException e) {
            System.out.println(e);
        }

    }

    public void testEx2p372() {
        ForNullPointer nullPointer = null;
        try {
            nullPointer.callNullPointer();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void testEx9p378() {
        ExciteExceptions exciteExceptions = new ExciteExceptions();
        try {
            exciteExceptions.excite(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testEx10p385() {
        TwoMethodsClass twoMethodsClass = new TwoMethodsClass();
        try {
            twoMethodsClass.f();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.err.flush();
            System.out.println("Перехвачено RuntimeException!");

        }


    }

    public void testFindSimpleNumber(){
        FindSimple findSimple = new FindSimple();
        findSimple.repeatFindSimple();
    }

    public void testCountSimpleNumbers(){
        FindSimple findSimple = new FindSimple();
        findSimple.countSimpleNumbers(100);
    }

}
