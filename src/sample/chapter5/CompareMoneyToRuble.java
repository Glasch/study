package sample.chapter5;

/**
 * Copyright (c) Anton on 03.08.2017.
 */
public class CompareMoneyToRuble {
    Money value;

    public static void compare() {
        for (Money value : Money.values()) {
            switch (value) {
                case EURO:
                    System.out.println("1 EURO = 71,69 RUB ");
                    break;
                case YENA:
                    System.out.println("1 YENA = 0,547 RUB ");
                    break;
                case FRANK:
                    System.out.println("1 FRANK = 62,75 RUB ");
                    break;
                case DOLLAR:
                    System.out.println("1 EURO = 60,58 RUB ");
                    break;
                case GRIVNA:
                    System.out.println("1 EURO = 2,34 RUB ");
                    break;
            }


        }

    }
}
