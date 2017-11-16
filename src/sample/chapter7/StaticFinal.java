package sample.chapter7;

/**
 * Copyright (c) Anton on 31.08.2017.
 */
public class StaticFinal {
    static final int B;
    final int a;

    public StaticFinal(int a) {
        this.a = a;
    }

    static {
        B = 3;
    }

    @Override
    public String toString() {
        return "a = " + a + " b = " + B;
    }
}
