package sample.selfMadeJavaParcer;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Copyright (c) Anton on 26.10.2017.
 */
public class TestSelfMadeJavaParcer extends TestCase {
    public void testSelfMadeJVP() throws IOException {
        Jvp jvp = new Jvp();
        String path ="C:\\Users\\Anton\\IdeaProjects\\Studing\\test\\sample\\selfMadeJavaParcer\\Test2Ex17p446.java";
        ArrayList <String> comments = jvp.extractAllComments(new File(path));
        jvp.printComments(comments);


    }

    public void testMatcher(){
        String line = "/*this.s = s;*/\n";
        assertTrue(line.matches(".*\\*/.*"));
    }
}
