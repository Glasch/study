package sample.chapter11;

/**
 * Copyright (c) Anton on 21.09.2017.
 */
public class Gerbil implements Mammal{
    int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop(){
        System.out.println(gerbilNumber + " Lalalal!");
    }
}
