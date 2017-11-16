package sample.chapter8;

/**
 * Copyright (c) Anton on 06.09.2017.
 */
public class Cat extends Mammal {
    @Override
    void speaking() {
        System.out.println("Mew!");
    }

    @Override
    void eating() {
        System.out.println("First choice is fish.");
          }
}
