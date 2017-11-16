package sample.cars;

import com.sun.istack.internal.NotNull;

/**
 * Copyright (c) Anton on 20.07.2017.
 */
public class Ship {
    private int deadWeight;
    private int power;
    private String name;
    private boolean isBarge;
    private Location location = new Location(10, 15);

    //test

    public Ship(int deadWeight, int power, @NotNull String name) {
        this.deadWeight = deadWeight;
        if (deadWeight <= 0) {
            throw new IllegalStateException(" Ship weight must be positive! Actual value: " + deadWeight);
        }
        this.name = name;

        setPower(power);
    }

    public static class Location{

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int x;
        int y;

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public Location getLocation() {
        return location;
    }

    public Ship(int deadWeight, @NotNull String name) {
        this(deadWeight, 0, name);
    }

    public double calcPowerRatio() {
        return power / deadWeight;

    }

    public int getDeadWeight() {
        return deadWeight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power < 0) {
            throw new IllegalStateException(" Ship power can't be negative! Actual value: " + power);
        }
        isBarge = power == 0;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBarge() {
        return isBarge;
    }

    @Override
    public String toString() {
        return " Name: " + getName() + "\n power to weight : " + calcPowerRatio() + "\n barge: " + isBarge();
    }
}
