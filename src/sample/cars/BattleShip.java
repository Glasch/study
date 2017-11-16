package sample.cars;

/**
 * Copyright (c) Anton on 20.07.2017.
 */
public class BattleShip extends Ship{
    private int cannons;

    public BattleShip(int deadWeight, int power, String name, int cannons) {
        super(deadWeight, power, name);
        this.cannons = cannons;
    }

    @Override
    public String toString() {
        return super.toString() + " \n Cannons: " + cannons;
    }
}
