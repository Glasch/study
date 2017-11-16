package sample.chapter7;

import junit.framework.TestCase;

/**
 * Copyright (c) Anton on 31.08.2017.
 */
public class TestChapter7 extends TestCase {

    public void testEx1p209() {
        Container container = new Container();
        Content content = container.getContent();
        assertNotNull(content);


        Content content2 = container.getContent();
        assertEquals(content, content2);

    }

    public void testEx2p211() {
        Car bmw = new Car();
        assertEquals(1, bmw.getSpeed());
        bmw = new BMWCar();
        assertEquals(2, bmw.getSpeed());
        ((BMWCar) bmw).drive();

    }

    public void testEx2_1p211() {
        BMWCar bmw5 = new BMWCar();
        bmw5.drive();
        ((Car) bmw5).getSpeed();
        //bmw5 = new Car();
    }

    public void testEx3p212() {
        Woman mary = new Woman();

    }

    public void testEx5p212() {
        C c = new C();
    }

    public void testEx9p213() {
        Stem stem = new Stem();

    }

    public void testEx11p215() {
        RhiDog rhiDog = new RhiDog();
        rhiDog.bark();
        rhiDog.impale();
        rhiDog.getBulldog().bark();
        rhiDog.getRhino().impale();
    }

    public void testEx18p228(){
        StaticFinal staticFinal = new StaticFinal(2);
        System.out.println("staticFinal = " + staticFinal);
        StaticFinal staticFinal1 = new StaticFinal(5);
        System.out.println("staticFinal1 = " + staticFinal1);
    }

}
