package sample.chapter8;

import junit.framework.TestCase;
import sample.chapter8.listener.StarshipAlertListenerImpl;

import java.util.Random;

/**
 * Copyright (c) Anton on 06.09.2017.
 */
public class TestChapter8 extends TestCase {
    public void testEx1p240() {
        Bicycle bicycle = new Bicycle();
        bicycle.ride();
        Cycle cycle = (Cycle) bicycle; // TODO: 07.09.2017 is it upcasting?
        //cycle.ride;
        Bicycle bicycle1 = (Bicycle) cycle;
        bicycle1.ride();
    }

    public void testEx9p247() {
        Mammal[] mammals = new Mammal[4];
        Random random = new Random();
        for (int i = 0; i < mammals.length; i++) {
            mammals[i] = random.nextBoolean() ? new Dog() : new Cat();
        }
        for (int i = 0; i < mammals.length; i++) {
            Mammal mammal = mammals[i];
            mammal.speaking();
            mammal.eating();
        }
    }

    public void testEx10p247() {
        ExtendsBasic extendsBasic = new ExtendsBasic();
        extendsBasic.first();
        //  Object basicObj = extendsBasic;
        // ((Basic)extendsBasic).first();
        //  String basic;
        //  extendsBasic = basic;
        //  basic = (extendsBasic) basicObj;
        //  basic.length();
    }

    public void testEx18p261() {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Tricycle();
        cycles[2] = new Bicycle();
        for (Cycle cycle : cycles) {
            if (cycle instanceof Unicycle){
                ((Unicycle) cycle).balance();
            }
        }
    }

    public void testEx17p260(){
        Starship starship = new Starship();
        starship.setAlertStatus(new RedAlert());
        starship.setAlertStatus(new OrangeAlert());

        StarshipAlertListenerImpl starshipAlertListener = new StarshipAlertListenerImpl();
        starship.setAlertListener(starshipAlertListener);

        starship.setAlertStatus(new RedAlert());
        starship.setAlertStatus(new OrangeAlert());
    }

}
