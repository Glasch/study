package sample.chapter9;

/**
 * Copyright (c) Anton on 14.09.2017.
 */
public class Coinflip implements Flip{
    @Override
    public void flip() {
        System.out.println("Выполнен бросок монетки!");
    }
}
