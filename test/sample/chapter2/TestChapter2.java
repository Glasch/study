package sample.chapter2;

import junit.framework.TestCase;

/**
 * Created by Anton on 30.05.2017.
 */
public class TestChapter2 extends TestCase {


    public void testChapter2() {
        int y = Chapter2.chapter21(1, 3);
        System.out.println("y = " + y);
        assertEquals(4, y);
    }

    public void testIncrementable() {
        int j = Incrementable.increment(99);
        System.out.println(j);
        assertEquals(100, j);
    }

    public void testStorage() {
        int p = Storage.storage("Im Anton");
        System.out.println(p * 2);
    }

    public void testHelloWorld() {
        HelloWorld.HelloWorld();
    }

    public void testHelloDate() {
        HelloDate.HelloDate();
    }

}
