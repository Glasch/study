package sample.excercises;

import junit.framework.TestCase;

/**
 * Copyright (c) Anton on 15.11.2017.
 */
public class TestTheFableOfLemons extends TestCase {


    // КАК В ЗАДАНИИ

    public void testTheFableOfLemons_1() {
        TheFableOfTheLemons theFableOfTheLemons = new TheFableOfTheLemons();
        int i = theFableOfTheLemons.countVariants(5, 2);
        assertEquals(24, i);
    }

//----------------------------------------------------------------------------------------------

    // ОШИБКИ

    // Терпение цензора превосходит кол-во повторов
    public void testTheFableOfLemons_2() {
        TheFableOfTheLemons theFableOfTheLemons = new TheFableOfTheLemons();
        try {
            int i = theFableOfTheLemons.countVariants(1, 2);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

    // В тексте нет ни одного "критичного" слова
    public void testTheFableOfLemons_3() {
        TheFableOfTheLemons theFableOfTheLemons = new TheFableOfTheLemons();
        try {
            int i = theFableOfTheLemons.countVariants(0, 2);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

    // Количество "критичных" слов больше 10000
    public void testTheFableOfLemons_4() {
        TheFableOfTheLemons theFableOfTheLemons = new TheFableOfTheLemons();
        try {
            int i = theFableOfTheLemons.countVariants(1000000, 2);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

    // Терпение цензора отрицательно
    public void testTheFableOfLemons_5() {
        TheFableOfTheLemons theFableOfTheLemons = new TheFableOfTheLemons();
        try {
            int i = theFableOfTheLemons.countVariants(10, -1);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

//------------------------------------------------------------------------------------------

    // КРАЙНИЕ ТОЧКИ


    // В тексте столько же, сколько терпет Цензор
    public void testTheFableOfLemons_6() {
        TheFableOfTheLemons theFableOfTheLemons = new TheFableOfTheLemons();
        int i = 0;
        try {
            i = theFableOfTheLemons.countVariants(5, 5);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        assertEquals(32, i);
    }

    // В тексте ровно 1 слово и его терпит цензор
    public void testTheFableOfLemons_7() {
        TheFableOfTheLemons theFableOfTheLemons = new TheFableOfTheLemons();
        int i = 0;
        try {
            i = theFableOfTheLemons.countVariants(1, 1);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        assertEquals(2, i);
    }

    // В тексте ровно 1 слово и его не терпит цензор
    public void testTheFableOfLemons_8() {
        TheFableOfTheLemons theFableOfTheLemons = new TheFableOfTheLemons();
        int i = 0;
        try {
            i = theFableOfTheLemons.countVariants(1, 0);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        assertEquals(1, i);
    }

//---------------------------------------------------------------------------------------

    // ИМПЕРИЧЕСКИЕ ТЕСТЫ НА РАЗНЫЕ ВАРИАНТЫ

    public void testTheFableOfLemons_9() {
        TheFableOfTheLemons theFableOfTheLemons = new TheFableOfTheLemons();
        int i = 0;
        try {
            i = theFableOfTheLemons.countVariants(4, 1);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        assertEquals(8, i);
    }


    public void testTheFableOfLemons_10() {
        TheFableOfTheLemons theFableOfTheLemons = new TheFableOfTheLemons();
        int i = 0;
        try {
            i = theFableOfTheLemons.countVariants(3, 2);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        assertEquals(6, i);
    }





}






