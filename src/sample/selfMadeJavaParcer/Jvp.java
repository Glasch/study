package sample.selfMadeJavaParcer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Copyright (c) Anton on 25.10.2017.
 */
public class Jvp {

    ArrayList <String> extractAllComments(File file) throws IOException {
        ArrayList <String> allComments = new ArrayList <>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;

        do {
            line = bufferedReader.readLine();
            if (line == null) continue;

            int commentStartIndex = findStartCommentIndex(line, false);
            if (commentStartIndex == -1) {
                commentStartIndex = findStartCommentIndex(line, true);
                if (commentStartIndex != -1) {
                    allComments.add(line.substring(commentStartIndex));
                }

            } else line = processSlashAsterisk(allComments, bufferedReader, line, commentStartIndex);
        }while (line != null);
        return allComments;

    }

    private String processSlashAsterisk(ArrayList <String> allComments, BufferedReader bufferedReader, String line, int trueIndex) throws IOException {
        line = line.substring(trueIndex);

        String comment = "";
        while (!line.matches(".*\\*/.*")) {
            comment += line + "\n";
            line = bufferedReader.readLine();
        }

        comment += line.substring(0, line.indexOf("*/") + 2);
        allComments.add(comment);
        return line;
    }

    public void printComments(ArrayList <String> allComments) {
        for (String each : allComments) {
            System.out.println(each);
            System.out.println("-----------------------------");
        }
    }

    private int findStartCommentIndex(String s, boolean doubleSlash) {
        boolean inBrackets = false;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == '"') {
                inBrackets = !inBrackets;
            }
            if (!inBrackets && chars[i] == '/') {
                if (doubleSlash) {
                    if (chars[i + 1] == '*') return -1;
                    if (chars[i + 1] == '/') return i;
                } else {
                    if (chars[i + 1] == '/') return -1;
                    if (chars[i + 1] == '*') return i;
                }
            }
        }
        return -1;
    }


}













