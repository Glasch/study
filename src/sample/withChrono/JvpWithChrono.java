package sample.withChrono;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Copyright (c) Anton on 25.10.2017.
 */
public class JvpWithChrono {

    ArrayList <String> extractAllComments(File file) throws IOException {
        System.out.println("  Зашли в метод extractAllComments ");

        ArrayList <String> allComments = new ArrayList <>();
        System.out.println("  Определили и инициализировали ArrayList <String> allComments ");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        System.out.println("  Определили и инициализировали BufferedReader bufferedReader ");

        String line;
        System.out.println("  Определили String line ");

        do {
            System.out.println(" Зашли в цикл while/do, который выполняется пока у нас еще есть строки для анализа ");
            line = bufferedReader.readLine();
            System.out.println("  Прочитали строку  ");

            if (line == null) {
                System.out.println(" т.к. строки нет - выходим из цикла ");
                continue;
            }

            System.out.println(" т.к. строка есть -  анализируем её ");

            int commentStartIndex = findStartCommentIndex(line, false);
            System.out.println(" определили переменную int commentStartIndex присвоили ей результат выполнения метода " +
                    "findStartCommentIndex(Наша строка, нет двойного слеша) - который ищет старт комментария /* при условии, что он не в кавычках");

            if (commentStartIndex == -1) {
                System.out.println(" Этот код выполняется если старт вида /* не найден  ");

                commentStartIndex = findStartCommentIndex(line, true);
                System.out.println(" Проверяем строку на начало комментария вида //");

                if (commentStartIndex == -1)
                {
                    System.out.println(" Начало комментария не найдено, проверяем следующую строку если она есть ");
                    continue;
                }

            }
            else {
                line = processSlashAsterisk(allComments, bufferedReader, line, commentStartIndex);
                System.out.println(" Если знак открытия комментария найден, то присваиваем line результат метода processSlashAsterisk который формирует комментарий" +
                 " в зависимости от того, какой знак открытия был найден  ");
            }
        }
        while (line != null);
        System.out.println(" Вышли из цикла while/do и Возвращаем allComments ");
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
                    if (chars[i + 1] == '/') return i;
                    if (chars[i + 1] == '*') return -1;
                }
            }
        }
        return -1;
    }


}

