package sample.chapter3;

import com.sun.org.apache.xpath.internal.operations.Equals;

/**
 * Copyright (c) Anton on 12.06.2017.
 */
/* Ex. 14 p. 126*/
class StringsComparer {
    static void compareStrings(String s1, String s2) {
        System.out.println(s1 + " compareTo " + s2 + ": " + s1.compareTo(s2));
    }
    static void testEquals(String s1, String s2) {
        System.out.println(s1 + " == " + s2 + ": " + (s1 == s2));
        System.out.println(s1 + " != " + s2 + ": " + (s1 != s2));
        System.out.println(s1 + " equals " + s2 + ": " + s1.equals(s2) );
    }

}
