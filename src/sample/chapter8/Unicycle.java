package sample.chapter8;

/**
 * Copyright (c) Anton on 06.09.2017.
 */
public class Unicycle extends Cycle {

    void ride() {
        System.out.println("Unicycle.ride");
        wheels(1);
    }
    void balance(){
        System.out.println("Unicycle.balance");
    }
}
