package sample.cars;

/**
 * Copyright (c) Anton on 30.05.2017.
 */
class Car {
    static final int MAX_SPEED_FOR_MAKE = 100;
    private int speed = MAX_SPEED_FOR_MAKE;

    Car(String regNumber) {
        String regNumber1 = regNumber;
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        if(speed > MAX_SPEED_FOR_MAKE){
            throw new IllegalStateException("Speed is " + speed + ", above max value: " + MAX_SPEED_FOR_MAKE);
        }
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return speed == car.speed;
    }
}
