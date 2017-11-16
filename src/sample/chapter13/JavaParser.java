package sample.chapter13;


import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Copyright (c) Anton on 19.10.2017.
 */
public class JavaParser {
    ArrayList <String> printComments(File file) throws IOException {
        ArrayList <String> result = new ArrayList <>();
        BufferedReader fileReader = new BufferedReader(new FileReader(file));

        String line = fileReader.readLine();
        while (line != null) {

            String[] substrings = line.split("//");
            boolean found = false;
            StringBuilder comment = new StringBuilder();
            int count = 0;
            for (String substring : substrings) {

            count += StringUtils.countMatches(substring, '"');

                if (found) {
                    comment.append(substring);
                }

                if (count % 2 == 0) {
                    found = true;
                }

                if (comment.length() > 0) {
                    result.add(comment.toString());
                }


            }



            if (line.matches(".*/\\*.*\\*/")) {
                if (comment.length() > 0) {
                    result.add(line.substring(line.indexOf("/*") + 2, line.indexOf("*/")));
                }
            }
            line = fileReader.readLine();
        }
        return result;
    }
}


