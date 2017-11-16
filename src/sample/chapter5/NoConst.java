package sample.chapter5;

/**
 * Copyright (c) Anton on 03.08.2017.
 */
public class NoConst {
    void first(){
        System.out.println(1);
        this.second();
        second();
    }
    void second() {
        System.out.println(2);
    }

}
