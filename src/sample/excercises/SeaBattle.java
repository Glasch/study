package sample.excercises;

import java.util.ArrayList;

/**
 * Copyright (c) Anton on 16.11.2017.
 */
public class SeaBattle {

    static int countShips = 0;
    static int shouldBeShips;

    public static void setShouldBeShips(int shouldBeShips) {
        SeaBattle.shouldBeShips = shouldBeShips;
    }

    ArrayList <ArrayList <Integer>> battleSea = new ArrayList <>();

    ArrayList <Integer> createCage(int x, int y) {
        ArrayList <Integer> cage = new ArrayList <>();
        cage.add(x);
        cage.add(y);
        return cage;
    }

    void setBattleSea(int sizeX, int sizeY) {

        ArrayList <ArrayList <Integer>> battleSea1 = new ArrayList <>();

        for (int x = 1; x <= sizeX; x++) {
            for (int y = 1; y <= sizeY; y++) {
                battleSea1.add(createCage(x, y));
            }
            battleSea = battleSea1;
        }

        System.out.println("Поле Боя : " + battleSea);
    }

    ArrayList <ArrayList <Integer>> createShip(int x, int y, int length, boolean wayToNorth) {

        ArrayList <ArrayList <Integer>> ship = new ArrayList <>();


        if (wayToNorth) {
            for (int i = y; i <= (y + (length - 1)); i++) {
                if (battleSea.contains(createCage(x, i))) {
                    createControllArea(x, ship, i);

                } else {
                    throw new IllegalArgumentException("Поле Занято");
                }
            }
        } else {

            for (int i = x; i <= (x + (length - 1)); i++) {
                if (battleSea.contains(createCage(i, y))) {
                    createControllArea(i, ship, y);
                } else {
                    throw new IllegalArgumentException("Поле Занято");
                }
            }


        }
        System.out.println("Корабль : " + ship);
        countShips++;
        return ship;
    }

    void createFreeBattleArea(ArrayList <ArrayList <Integer>> ship) {

        for (ArrayList <Integer> shipCage : ship) {
            if (battleSea.contains(shipCage)) {
                battleSea.remove(shipCage);
            }

        }
        System.out.println("Свободное Поле боя с кораблем : " + battleSea);

    }


    private void createControllArea(int x, ArrayList <ArrayList <Integer>> ship, int i) {
        if (battleSea.contains(createCage(x, i)) && !ship.contains(createCage(x, i))) {
            ship.add(createCage(x, i));
        }
        if (battleSea.contains(createCage(x, i - 1)) && !ship.contains(createCage(x, i - 1))) {
            ship.add(createCage(x, i - 1));
        }
        if (battleSea.contains(createCage(x + 1, i - 1)) && !ship.contains(createCage(x + 1, i - 1))) {
            ship.add(createCage(x + 1, i - 1));
        }
        if (battleSea.contains(createCage(x + 1, i)) && !ship.contains(createCage(x + 1, i))) {
            ship.add(createCage(x + 1, i));
        }
        if (battleSea.contains(createCage(x + 1, i + 1)) && !ship.contains(createCage(x + 1, i + 1))) {
            ship.add(createCage(x + 1, i + 1));
        }
        if (battleSea.contains(createCage(x, i + 1)) && !ship.contains(createCage(x, i + 1))) {
            ship.add(createCage(x, i + 1));
        }
        if (battleSea.contains(createCage(x - 1, i + 1)) && !ship.contains(createCage(x - 1, i + 1))) {
            ship.add(createCage(x - 1, i + 1));
        }
        if (battleSea.contains(createCage(x - 1, i)) && !ship.contains(createCage(x - 1, i))) {
            ship.add(createCage(x - 1, i));
        }
        if (battleSea.contains(createCage(x - 1, i - 1)) && !ship.contains(createCage(x - 1, i - 1))) {
            ship.add(createCage(x - 1, i - 1));
        }
    }


    int countPossibleShips() {

        if (countShips > shouldBeShips) {
            throw new IllegalArgumentException("Нас дезинфиромируют!");
        }

        if (countShips < shouldBeShips) {
            throw new IllegalArgumentException("Разведка не закончила работу!");
        }

        return 5;
    }


}
