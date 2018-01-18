package sample.chapter4;

import junit.framework.TestCase;
import sample.chapter3.PodrOper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Copyright (c) Anton on 12.06.2017.
 */
public class TestChapter4 extends TestCase {

    public void testCounter() {
        Counter.oneToAny(100);
    }

    public void testComparerRandomValues() {
        ComparerRandomValues.randomazys(92);
        ComparerRandomValues.randomazysEndless(888);
    }


    public void testSimpleNumbers() {
        SimpleNumbers.poisk(10000);

    }

    public void testPodrOperIntToBinary() {
        // PodrOper.intToBinary(33);
        System.out.println(PodrOper.intToBinary(33));

    }

    public void testSwitch() {
        Switch.findWayToHell();
    }

    public void testFibonacci() {
        List<BigDecimal> fiboNumbers  = Fibonacci.findFiboNumbers(6);
        for (BigDecimal fiboNumber : fiboNumbers) {
            System.out.println(fiboNumber);
        }

//        for(int i = 0; i < fiboNumbers.size(); i++){
//            System.out.println(fiboNumbers.get(i));
//        }
    }

    public  void  testFindVamps (){
        List<VampInfo> vamps = Vamps.findVamps(6);
        for (VampInfo vamp : vamps) {
            System.out.println(vamp);
        }

//        for (int i = 0; i < vamps.size(); i++) {
//            VampInfo vamp = vamps.get(i);
//            System.out.println(vamp);
//        }

//        vamps.forEach(System.out::println);

    }
}
