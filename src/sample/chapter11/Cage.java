package sample.chapter11;

/**
 * Copyright (c) Anton on 21.09.2017.
 */
public class Cage<M extends Mammal> {
    M dweller;

    public Cage(M dweller) {
        this.dweller = dweller;
    }

    public M getDweller() {
        return dweller;
    }
}
