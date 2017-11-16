package sample.chapter10;

/**
 * Copyright (c) Anton on 18.09.2017.
 */
public class Outer {
    private String s;

    public Outer(String s) {
        this.s = s;
    }

    public  class Inner {
        @Override
        public String toString() {
            return (s);
        }
    }

    public Inner returnInner(){
        return new Inner();
    }
}
