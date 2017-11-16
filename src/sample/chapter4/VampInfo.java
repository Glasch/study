package sample.chapter4;

/**
 * Copyright (c) Anton on 27.07.2017.
 */
public class VampInfo {
    int result;
    int firstFactor;
    int secondFactor;
  // Alt + insert getters
  // ctrl + o
    @Override
    public String toString() {
        return result + " = " + firstFactor + " * " + secondFactor;
    }
}
