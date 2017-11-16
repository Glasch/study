package sample.excercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Copyright (c) Anton on 08.11.2017.
 */
public class ReverseRoot {

    void printRoot(File file) throws IOException {

        ArrayList <String> arrayList = new ArrayList <>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;

        do {
            line = bufferedReader.readLine();
            if (line == null) break;
            arrayList.addAll(Arrays.asList(line.split(" ")));
        }
        while (true);
        for (int i = arrayList.size() - 1; i > -1; i--) {
            String s = arrayList.get(i);
            if (s.matches("^[0-9].*")) {
                double value = Math.sqrt(Integer.parseInt(s));
                System.out.printf("Корень из %s  =  " + "%.4f\n", s, value);
            }
        }
    }
}



