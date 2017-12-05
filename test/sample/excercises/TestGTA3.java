package sample.excercises;

import junit.framework.TestCase;

/**
 * Copyright (c) Anton on 21.11.2017.
 */
public class TestGTA3 extends TestCase {

//Как в задании
    public void testGTA3_1(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        GTA3 gta3 = new GTA3();
        gta3.playGTA3(3, 7, array);
        assertEquals(21, gta3.getFirstPlayerValue());
        assertEquals(24, gta3.getSecondPlayerValue());
    }

    public void testGTA3_2(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        GTA3 gta3 = new GTA3();
        gta3.playGTA3(5, 4, array);
        assertEquals(30 , gta3.getFirstPlayerValue());
        assertEquals(15, gta3.getSecondPlayerValue());
    }

    public void testGTA3_3(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        GTA3 gta3 = new GTA3();
        gta3.playGTA3(4, 5, array);
        assertEquals(15 , gta3.getFirstPlayerValue());
        assertEquals(30, gta3.getSecondPlayerValue());
    }

    public void testGTA3_4(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        GTA3 gta3 = new GTA3();
        gta3.playGTA3(0, 0, array);
        assertEquals(45 , gta3.getFirstPlayerValue());
        assertEquals(0, gta3.getSecondPlayerValue());
    }

    public void testGTA3_5(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        GTA3 gta3 = new GTA3();
        gta3.playGTA3(9, 9, array);
        assertEquals(45 , gta3.getFirstPlayerValue());
        assertEquals(0, gta3.getSecondPlayerValue());
    }

    public void testGTA3_6(){
        int[] array = {2,3,4,5,6,7,8,9,0};
        GTA3 gta3 = new GTA3();
        gta3.playGTA3(8, 8, array);
        assertEquals(44 , gta3.getFirstPlayerValue());
        assertEquals(0, gta3.getSecondPlayerValue());
    }

    public void testGTA3_7(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        GTA3 gta3 = new GTA3();
        gta3.playGTA3(4, 8, array);
        assertEquals(28 , gta3.getFirstPlayerValue());
        assertEquals(17, gta3.getSecondPlayerValue());
    }

    public void testGTA3_8(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        GTA3 gta3 = new GTA3();
        gta3.playGTA3(8, 4, array);
        assertEquals(24 , gta3.getFirstPlayerValue());
        assertEquals(21, gta3.getSecondPlayerValue());
    }






}
