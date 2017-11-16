package sample.chapter8;

/**
 * Copyright (c) Anton on 06.09.2017.
 */
public class Bicycle extends Cycle {

    void ride() {
        System.out.println("Bicycle.ride");
        wheels(2);
    }

    void balance(){
        System.out.println("Bicycle.balance");
    }

}
