package sample.chapter4;

import java.util.Random;

/**
 * Copyright (c) Anton on 19.07.2017.
 */
class Switch {
    static void findWayToHell() {

        Random rnd = new Random();
      //  highWayToHell:
        for (int i = 1; ; i++) {
            int c = rnd.nextInt(1000);
            System.out.print("c = " + c);
            switch (c) {
                case 6:
                    System.out.println(" - Ты на порочном пути! ");
                    break ;
                case 66:
                    System.out.println(" - Еще немного погреши! ");
                    break ;
                case 666: {
                    System.out.println(" - Ад Найден ");
                    System.out.println(" Тебе понадобилось " + i + " грехов!");
                    //break highWayToHell;
                    return;
                }

                default: {
                    System.out.println(" Неееет, Нужны еще грехи, ты слишком святой!");

                }
            }

        }


    }
}
