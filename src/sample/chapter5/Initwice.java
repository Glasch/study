package sample.chapter5;

/**
 * Copyright (c) Anton on 09.08.2017.
 */
public class Initwice {
    static String s = "Hello!";
    static  String s1;
    static {
        s = "Bye!";
    }
    static void printIt(){
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);

    }
}







