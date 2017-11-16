package sample.excercises;

/**
 * Copyright (c) Anton on 09.11.2017.
 */
public class InputHelper {
    static int[] parseIntLine(String line, int count) {
        String[] intStrings = line.split(" ");
        int[] resultArray = new int[count];
        int i = 0;
        for (String each : intStrings) {
            if (i == count) break;
            resultArray[i++] = Integer.parseInt(each);
        }
        return resultArray;
    }

}
