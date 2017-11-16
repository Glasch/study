package sample.chapter5;

/**
 * Copyright (c) Anton on 03.08.2017.
 */
public class Finalize {
        @Override
    protected void finalize() throws Throwable {
        System.out.println("I'm dying");
    }
}
