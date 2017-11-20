package sample.excercises;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;

/**
 * Copyright (c) Anton on 08.11.2017.
 */
public class TestGTA2 extends TestCase {

// ТЕСТЫ ЧЕТНОГО МАССИВА

    // Как в Задании
    public void testGTA2_0(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(3, 7, array);
        assertEquals(21, gta2.getFirstPlayerValue());
        assertEquals(24, gta2.getSecondPlayerValue());
    }

    // Как в задании обратный порядок
    public void testGTA2_1(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(7, 3, array);
        assertEquals(24, gta2.getFirstPlayerValue());
        assertEquals(21, gta2.getSecondPlayerValue());
    }

    // Первый в начале,  второй в конце
    public void testGTA2_2(){
        int[] array = {1,2,3,4,5,6,7,8,9,11};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(0, 9, array);
        assertEquals(15, gta2.getFirstPlayerValue());
        assertEquals(41, gta2.getSecondPlayerValue());
    }

    // Первый в конце,  второй в начале
    public void testGTA2_3(){
        int[] array = {1,2,3,4,5,6,7,8,9,11};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(9, 0, array);
        assertEquals(41, gta2.getFirstPlayerValue());
        assertEquals(15, gta2.getSecondPlayerValue());

    }

    // Первый в начале, второй рядом
    public void testGTA2_4(){
        int[] array = {1,2,3,4,5,6,7,8,9,11};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(0, 1, array);
        assertEquals(1, gta2.getFirstPlayerValue());
        assertEquals(55, gta2.getSecondPlayerValue());

    }

    // Второй в начале, первый рядом
    public void testGTA2_5(){
        int[] array = {1,2,3,4,5,6,7,8,9,11};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(1, 0, array);
        assertEquals(55, gta2.getFirstPlayerValue());
        assertEquals(1, gta2.getSecondPlayerValue());

    }

    // Первый последний, второй предпоследний
    public void testGTA2_6(){
        int[] array = {1,2,3,4,5,6,7,8,9,11};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(9, 8, array);
        assertEquals(11, gta2.getFirstPlayerValue());
        assertEquals(45, gta2.getSecondPlayerValue());

    }

    // Второй последний, первый предпоследний
    public void testGTA2_7(){
        int[] array = {1,2,3,4,5,6,7,8,9,11};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(8, 9, array);
        assertEquals(45, gta2.getFirstPlayerValue());
        assertEquals(11, gta2.getSecondPlayerValue());

    }

    // Оба рядом в центре
    public void testGTA2_8(){
        int[] array = {1,2,3,4,5,6,7,8,9,11};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(4, 5, array);
        assertEquals(15, gta2.getFirstPlayerValue());
        assertEquals(41, gta2.getSecondPlayerValue());

    }

    // Оба рядом в центре места наоброт
    public void testGTA2_9(){
        int[] array = {1,2,3,4,5,6,7,8,9,11};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(5, 4, array);
        assertEquals(41, gta2.getFirstPlayerValue());
        assertEquals(15, gta2.getSecondPlayerValue());

    }

    // Оба в центре
    public void testGTA2_10(){
        int[] array = {1,2,3,4,5,6,7,8,9,11};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(4, 4, array);
        assertEquals(46, gta2.getFirstPlayerValue());
        assertEquals(10, gta2.getSecondPlayerValue());
    }

    // Оба в начале
    public void testGTA2_23(){
        int[] array = {1,2,3,4,5,6,7,8,9,11};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(0, 0, array);
        assertEquals(56, gta2.getFirstPlayerValue());
        assertEquals(0, gta2.getSecondPlayerValue());
    }

    // Оба в конце
    public void testGTA2_24(){
        int[] array = {1,2,3,4,5,6,7,8,9,11};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(9, 9, array);
        assertEquals(56, gta2.getFirstPlayerValue());
        assertEquals(0, gta2.getSecondPlayerValue());
    }

    // между игроками нечетное количество ячеек
    public void testGTA2_25(){
        int[] array = {1,2,3,4,5,6,7,8,9,11};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(2, 0, array);
        assertEquals(55, gta2.getFirstPlayerValue());
        assertEquals(1, gta2.getSecondPlayerValue());
    }

    // между игроками четное количество ячеек
    public void testGTA2_26(){
        int[] array = {1,2,3,4,5,6,7,8,9,11};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(3, 0, array);
        assertEquals(53, gta2.getFirstPlayerValue());
        assertEquals(3, gta2.getSecondPlayerValue());
    }



    // ТЕСТЫ НЕЧЕТНОГО МАССИВА


    // Первый в начале,  второй в конце
    public void testGTA2_11(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(0, 8, array);
        assertEquals(15, gta2.getFirstPlayerValue());
        assertEquals(30, gta2.getSecondPlayerValue());
    }

    // Первый в конце,  второй в начале
    public void testGTA2_12(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(8, 0, array);
        assertEquals(30, gta2.getFirstPlayerValue());
        assertEquals(15, gta2.getSecondPlayerValue());

    }

    // Первый в начале, второй рядом
    public void testGTA2_13(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(0, 1, array);
        assertEquals(1, gta2.getFirstPlayerValue());
        assertEquals(44, gta2.getSecondPlayerValue());

    }

    // Второй в начале, первый рядом
    public void testGTA2_14(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(1, 0, array);
        assertEquals(44, gta2.getFirstPlayerValue());
        assertEquals(1, gta2.getSecondPlayerValue());


    }

    // Первый последний, второй предпоследний
    public void testGTA2_15(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(8, 7, array);
        assertEquals(9, gta2.getFirstPlayerValue());
        assertEquals(36, gta2.getSecondPlayerValue());


    }

    // Второй последний, первый предпоследний
    public void testGTA2_16(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(7, 8, array);
        assertEquals(36, gta2.getFirstPlayerValue());
        assertEquals(9, gta2.getSecondPlayerValue());


    }

    // Оба рядом в центре
    public void testGTA2_17(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(4, 5, array);
        assertEquals(15, gta2.getFirstPlayerValue());
        assertEquals(30, gta2.getSecondPlayerValue());


    }

    // Оба рядом в центре места наоброт
    public void testGTA2_18(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(5, 4, array);
        assertEquals(30, gta2.getFirstPlayerValue());
        assertEquals(15, gta2.getSecondPlayerValue());


    }

    // Оба в Центре до мат. Центра
    public void testGTA2_19(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(3, 3, array);
        assertEquals(39, gta2.getFirstPlayerValue());
        assertEquals(6, gta2.getSecondPlayerValue());

    }

    // Оба в Центре после мат. Центра
    public void testGTA2_20(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(4, 4, array);
        assertEquals(35, gta2.getFirstPlayerValue());
        assertEquals(10, gta2.getSecondPlayerValue());

    }

    // Оба в начале
    public void testGTA2_21(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(0, 0, array);
        assertEquals(45, gta2.getFirstPlayerValue());
        assertEquals(0, gta2.getSecondPlayerValue());

    }

    // Оба в конце
    public void testGTA2_22(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(8, 8, array);
        assertEquals(45, gta2.getFirstPlayerValue());
        assertEquals(0, gta2.getSecondPlayerValue());

    }

 //-------------------------------------------------------------

    // Новые тесты

    // Между ними четное колл-во 1>2

    public void testGTA2_40(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(4, 1, array);
        assertEquals(40 , gta2.getFirstPlayerValue());
        assertEquals(5 , gta2.getSecondPlayerValue());

    }

    //  Между ними четное колл-во 1<2
    public void testGTA2_41(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(1, 4, array);
        assertEquals(5 , gta2.getFirstPlayerValue());
        assertEquals(40 , gta2.getSecondPlayerValue());

    }

    // Между ними НЕчетное колл-во 1>2

    public void testGTA2_42(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(4,2 , array);
        assertEquals(40 , gta2.getFirstPlayerValue());
        assertEquals(5 , gta2.getSecondPlayerValue());

    }

    //  Между ними НЕчетное колл-во 1<2
    public void testGTA2_43(){
        int[] array = {1,2,3,4,5,6,7,8,9};
        GTA2 gta2 = new GTA2();
        gta2.playGTA2(2, 4, array);
        assertEquals(9 , gta2.getFirstPlayerValue());
        assertEquals(36 , gta2.getSecondPlayerValue());

    }







}
