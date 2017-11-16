package sample.chapter5;

/**
 * Copyright (c) Anton on 03.08.2017.
 */
public enum Money {
    DOLLAR, FRANK, EURO, YENA, GRIVNA;

    public static void compare() {
        for (Money m : Money.values()) {
         //   System.out.print(m);
         //   System.out.print(" " + m.ordinal());
         //   System.out.println();
            System.out.println(m + " " + m.ordinal());
        }
    }
}
