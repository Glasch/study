package sample.chapter3;

import junit.framework.TestCase;

/**
 * Copyright (c) Anton on 30.05.2017.
 */

public class TestChapter3 extends TestCase {

    public void testAliasing() {
        Aliasing al;
        al = new Aliasing();
        al.primer();
    }

    public void testCoinFlip() {
        boolean res = CoinFlip.coinFly();
        String coinState = res ? "Орел" : "Решка";
        System.out.println("coinState = " + coinState);
    }

    public void testSpeed() {
        Speed st;
        st = new Speed();
        st.S = 1000;
        st.t = 50;
        double speed = st.speed();
        System.out.println("Speed = " + speed);
        assertEquals(20.0, speed);
    }

    public void testLiterals() {
        Literals.longToString();

    }

    public void testExponential() {
        Exponential.maxFloatAndDouble();
    }

    public void testPodrOper() {
        PodrOper.compareNumbers();

    }

    public void testOperSdv() {
        OperSdv.ex11();
        OperSdv.ex12();
        OperSdv.charToBinary();
    }

    public void testLast() {
        StringsComparer.compareStrings("poppa", "pppppppppppppzz");
        String a = "He";
        String b = "ro";
        StringsComparer.testEquals("Hero",a+b);
    }


}

