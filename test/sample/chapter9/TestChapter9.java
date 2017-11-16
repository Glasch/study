package sample.chapter9;

import junit.framework.TestCase;
import sample.chapter9.subChapter9.FirstImpl;

/**
 * Copyright (c) Anton on 07.09.2017.
 */
public class TestChapter9 extends TestCase {
    public void testEx5p269() {
        FirstImpl impFirst = new FirstImpl();
        System.out.println(impFirst.first(5));
        System.out.println(impFirst.second("ewkowepo"));
        System.out.println(impFirst.third(true));

    }

public void testEx19p287(){
        FlipFactory flipFactory = new CoinFlipFactory();
        flipFactory.createFlip().flip();
        FlipFactory flipFactory1 = new RubyFlipFactory();
        flipFactory1.createFlip().flip();
}

public void testNoFactory(){
    makeFlip(new Coinflip());
    makeFlip(new RubyFlip());
}

public void makeFlip(Flip flip){
    flip.flip();
}

}
