package sample.reflection;

import junit.framework.TestCase;

/*
 * Author: glaschenko
 * Created: 06.09.2018
 */
public class TestReflection extends TestCase {
    public void testWrite() {
        Hand hand = new Hand(1, "PS", 25);
        JSONWriter jsonWriter = new JSONWriter();
        String string = jsonWriter.write(hand);
        System.out.println("string = " + string);
    }
}
