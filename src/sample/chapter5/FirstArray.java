package sample.chapter5;

/**
 * Copyright (c) Anton on 09.08.2017.
 */
class FirstArray {
    private String[] s = new String[5];

    void addToArray() {
        s[0] = "Hello, ";
        s[1] = "my friend! ";
        s[2] = "Im glad ";
        s[3] = "to meet ";
        s[4] = "you!";
        for (String value : s) {
            System.out.print(value);
        }
    }
}
