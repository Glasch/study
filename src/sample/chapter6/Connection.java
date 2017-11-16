package sample.chapter6;

/**
 * Copyright (c) Anton on 10.08.2017.
 */
public class Connection {
    private boolean used = false;

     Connection() {
    }

    public void start() {
        used = true;
    }

    public void end() {
        used = false;
    }

    public boolean isUsed() {
        return used;
    }
}
