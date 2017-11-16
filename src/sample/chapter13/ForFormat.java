package sample.chapter13;

/**
 * Copyright (c) Anton on 18.10.2017.
 */
class ForFormat {
    private int anInt = 10;
    private long aLong = 2222222;
    private float aFloat = 3.3f;
    private double aDouble = 4.4;

    @Override
    public String toString() {
        return String.format("%s ", anInt ) + String.format("%s ", aLong ) + String.format("%s ", aFloat ) + String.format("%s ", aDouble );
}}
