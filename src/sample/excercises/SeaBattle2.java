package sample.excercises;

/**
 * Copyright (c) Anton on 16.11.2017.
 */
public class SeaBattle2 {
    private boolean[][] battleField;
    private int height;
    private int width;


    public SeaBattle2(int height, int width) {
        this.height = height;
        this.width = width;
        battleField = new boolean[width][height];
    }

    void addShip(Ship s) {
        for (int i = Math.max(0, s.x - 1); i <= Math.min(width - 1, s.x + s.xSpan); i++) {
            for (int j = Math.max(0, s.y - 1); j <= Math.min(height - 1, s.y + s.ySpan); j++) {
                battleField[i][j] = true;
            }
        }
    }

    int countPlacements(int length) {

        Ship s = new Ship(0, 0, length, true);
        int countPlacements = countPlacements(s);

        s = new Ship(0, 0, length, false);
        countPlacements += countPlacements(s);

        return countPlacements;
    }

    private int countPlacements(Ship s) {
        int countPlacements = 0;
        for (s.x = 0; s.x <= width - s.xSpan; s.x++) {
            for (s.y = 0; s.y <= height - s.ySpan; s.y++) {
                if (canPlaceShip(s)) countPlacements++;
            }
        }
        return countPlacements;
    }

    private boolean canPlaceShip(Ship s) {
        for (int i = Math.max(0, s.x ); i <= Math.min(width - 1, s.x + s.xSpan-1); i++) {
            for (int j = Math.max(0, s.y ); j <= Math.min(height - 1, s.y + s.ySpan-1); j++) {
                if (battleField[i][j]) return false;

            }
        }
        return true;
    }

    public static class Ship {
        final int xSpan;
        final int ySpan;
        final int length;
        final boolean isVertical;

        int x;
        int y;

        public Ship(int x, int y, int length, boolean isVertical) {
            this.x = x - 1;
            this.y = y - 1;
            this.length = length;
            this.isVertical = isVertical;

            xSpan = isVertical ? 1 : length;
            ySpan = isVertical ? length : 1;

        }
    }
}