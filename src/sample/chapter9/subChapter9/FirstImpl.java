package sample.chapter9.subChapter9;

import sample.chapter9.First;

/**
 * Copyright (c) Anton on 07.09.2017.
 */
public class FirstImpl implements First {


    @Override
    public int first(int i) {
        return i * 47;
    }

    @Override
    public String second(String s) {
        return s + "Agent";
    }

    @Override
    public Boolean third(Boolean coinFlip) {
        return coinFlip;
    }

}
