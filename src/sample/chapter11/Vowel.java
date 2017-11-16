package sample.chapter11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

/**
 * Copyright (c) Anton on 28.09.2017.
 */
public class Vowel {

    private static final Set <Character> vowels = new TreeSet <>();

    static {
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('Y');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
    }

    private static final Set <Character> separators = new TreeSet <>();

    static {
        Collections.addAll(separators, '!', '?', ',', ' ', '\n');
    }

    private Map <String, Integer> word2vowels = new HashMap <>();
    private int wordsCounter;
    private int vowelsCount;

    void countVowelsFromFile(String path) {
        final StringBuilder res = new StringBuilder();
        try {
            Files.lines(new File(path).toPath()).forEach(e -> {
                res.append(e).append("\n");
            });
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        countVowels(res.toString());
    }

    void countVowels(String inputString) {
        vowelsCount = 0;
        wordsCounter = 0;
        word2vowels.clear();
        StringBuilder word = new StringBuilder();
        Integer wordVowels = 0;
        char[] sToChar = inputString.toCharArray();
        for (char c : sToChar) {
            if (separators.contains(c)) {
                addWord(word, wordVowels);
                word = new StringBuilder();
                wordVowels = 0;

            } else {
                word.append(c);
                if (vowels.contains(c)) {
                    vowelsCount++;
                    wordVowels++;
                }
            }
        }
        addWord(word, wordVowels);
    }

    private void addWord(StringBuilder word, Integer wordVowels) {
        if (word.length() != 0) {
            wordsCounter++;
            word2vowels.put(word.toString(), wordVowels);
        }

    }

    public int getVowelsCount() {
        return vowelsCount;
    }

    public int getWordsCounter() {
        return wordsCounter;
    }

    public Integer getVowelsCount(String word) {
        return word2vowels.get(word);
    }

    public Map <String, Integer> getWord2vowels() {
        return word2vowels;
    }
}

