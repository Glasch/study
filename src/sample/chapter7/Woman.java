package sample.chapter7;

/**
 * Copyright (c) Anton on 31.08.2017.
 */
public class Woman extends Human {
    Human masha = new Human();
    public Woman() {
        //super(2);
        System.out.println("legsCount = " + legsCount);
        this.legsCount = 3;
        System.out.println("legsCount = " + legsCount);
        masha.f = 2;
    }

}
