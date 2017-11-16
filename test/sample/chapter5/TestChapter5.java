package sample.chapter5;

import junit.framework.TestCase;

import java.util.ArrayList;


/**
 * Copyright (c) Anton on 02.08.2017.
 */
public class TestChapter5 extends TestCase {

    public void testNotIniString() {
        NotIniString line = new NotIniString();
        System.out.println(line.getS());
        line.setS("Allo");
        System.out.println(line.getS());
    }

    public void testIniString() {
        IniString line = new IniString("QQ");
        System.out.println(line.getS1() + " " + line.getS2());
    }

    public void testDefaultConst() {
        new DefaultConst();

    }

    public void testEx2p152() {
        new DefaultConst("123");

    }

    public void testMoney() {
        Money.compare();
        CompareMoneyToRuble.compare();
    }

    public void testEx5p153() {
        Dog reks = new Dog();
        reks.bark(5);
        reks.bark('c');
        reks.bark(true);
        reks.bark(true, 'c');
        reks.bark('c', true);
    }

    public void testEx6p153() {
        NoConst nc = new NoConst();
    }

    public void testEx8p155() {
        NoConst first = new NoConst();
        first.first();
        first.second();
    }

    public void testEx10p161() {
        new Finalize();
        ArrayList<Integer> k  = new ArrayList <>();
        for (int i = 0; i < 10000000; i++) {
            k.add(i);

        }
        System.out.println(k.get(5));
    }

    public void testEx10p161_2() {
        new Finalize();
        System.gc();
    }

    public void testEx12p161(){
        Tank murom = new Tank(100);
        murom.setCurrentVolume(55);
        Tank vorm = new Tank(100);
        vorm.setCurrentVolume(0);
        murom = null;
        vorm = null;
        System.gc();

    }

    public void testEx14p172(){
        Initwice.printIt();
    }

    public void testEx16p177(){
       FirstArray firstArray = new FirstArray();
       firstArray.addToArray();


    }

}
