package sample.chapter3;

/**
 * Copyright (c) Anton on 11.06.2017.
 */
/* Ex. 3.8 p. 108*/
class Literals {
    static void longToString() {
        long i = 0x25;
        long j = 0254;
        System.out.println("Переменная 'i' в двоичной системе исчисления = " + Long.toBinaryString(i));
        System.out.println("Переменная 'j' в двоичной системе исчисления = " + Long.toBinaryString(j));
    }
}


