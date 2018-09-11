package sample.reflection;

import junit.framework.TestCase;
import org.json.JSONObject;

/*
 * Author: glaschenko
 * Created: 06.09.2018
 */
public class TestReflection extends TestCase {
    public void testWrite() {
        Hand hand = new Hand(1, "PS", 25);
        MyJSONWriter myJsonWriter = new MyJSONWriter();
        JSONObject string = myJsonWriter.write(hand);
        System.out.println("string = " + string);
    }
}
