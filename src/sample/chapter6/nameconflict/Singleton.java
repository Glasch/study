package sample.chapter6.nameconflict;

/**
 * Copyright (c) Anton on 10.08.2017.
 */
public class Singleton {
    private static Singleton instance;

    public int a;

    private Singleton() {
        a = 5;
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
