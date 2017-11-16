package sample.chapter8;

/**
 * Copyright (c) Anton on 07.09.2017.
 */
public class RedAlert implements AlertStatus{

    @Override
    public String print() {
        return  "Red!";
    }
}
