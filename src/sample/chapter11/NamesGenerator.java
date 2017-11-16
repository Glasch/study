package sample.chapter11;

/**
 * Copyright (c) Anton on 21.09.2017.
 */
public class NamesGenerator {
    private static final String names[] = {"Pitt", "Lysii", "Kluney", "Sasha", "Pacino"};
    private int i = 0;

    String next() {
        if (i >= names.length) {
            i = 0;
        }
        return names[i++];

    }
}
