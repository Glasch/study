package sample.cars;

import junit.framework.TestCase;

/**
 * Copyright (c) Anton on 30.05.2017.
 */
public class TestStatic extends TestCase{

    public static void testStatic(){
        Car myBMW = new Car("o277ax");
        myBMW.setSpeed(90);

        Car myMerc = new Car("a777aa");
        System.out.println("Static: " + Car.MAX_SPEED_FOR_MAKE);
        System.out.println("myMerc.getSpeed() = " + myMerc.getSpeed());
        System.out.println("myBMW.getSpeed() = " + myBMW.getSpeed());
    }

    public void testShip(){
        Ship fotinia = new Ship(50,100, "Fotinia");
        fotinia.setPower(0);
        System.out.println(fotinia);
        Ship lenin = new Ship(1000, "Lenin");

        System.out.println("Lenin is here: " + lenin.getLocation());


    }

    public void  testBattleShip(){
        BattleShip suvorov = new BattleShip(1000,1500,"Suvorov",10 );
        System.out.println(suvorov);

    }
}
