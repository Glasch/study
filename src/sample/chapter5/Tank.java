package sample.chapter5;

/**
 * Copyright (c) Anton on 03.08.2017.
 */
public class Tank {
    int capacity;
    int currentVolume;

    public Tank(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    @Override
    protected void finalize() throws Throwable {
        if (currentVolume > 0) {
            throw new IllegalStateException("Fuel is > 0");
        }
        System.out.println("Dead, fuel: " + currentVolume);
    }
}
