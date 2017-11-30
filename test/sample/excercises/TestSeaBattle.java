package sample.excercises;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Copyright (c) Anton on 16.11.2017.
 */
public class TestSeaBattle extends TestCase {

    public void testSeaBattle(){

        SeaBattle seaBattle = new SeaBattle();
        seaBattle.setBattleSea(4,4);
        ArrayList<ArrayList<Integer>> lenin = seaBattle.createShip(1,2,2,true);
        seaBattle.createFreeBattleArea(lenin);
        ArrayList<ArrayList<Integer>> stalin = seaBattle.createShip(3,1,2,false);
        seaBattle.createFreeBattleArea(stalin);
      //  ArrayList<ArrayList<Integer>> stalin = seaBattle.createShip(1,2,2,true);
      //  SeaBattle.setShouldBeShips(2);
      //  seaBattle.countPossibleShips();

    }

    public void testSeaBattle2(){
        SeaBattle2 seaBattle2 = new SeaBattle2(4,4);
        seaBattle2.addShip(new SeaBattle2.Ship(1,2,2,true));
        seaBattle2.addShip(new SeaBattle2.Ship(3,1,2,false));
        assertEquals(4,seaBattle2.countPlacements(2));

    }


    public void testSeaBattle3(){
        SeaBattle2 seaBattle2 = new SeaBattle2(4,4);
        seaBattle2.addShip(new SeaBattle2.Ship(1,2,2,true));
        seaBattle2.addShip(new SeaBattle2.Ship(3,1,2,false));
        assertEquals(4,seaBattle2.countPlacements(1));

    }

}