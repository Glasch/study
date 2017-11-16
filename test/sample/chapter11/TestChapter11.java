package sample.chapter11;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Copyright (c) Anton on 21.09.2017.
 */
public class TestChapter11 extends TestCase {
    public void testEx1p327() {
        ArrayList <Gerbil> gerbils = new ArrayList <>();
        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(55));
        gerbils.add(new Gerbil(14));
        gerbils.add(new Gerbil(85));


        Iterator <Gerbil> iterator = gerbils.iterator();
        while (iterator.hasNext()) {
            Gerbil next = iterator.next();
            next.hop();
        }

        for (Gerbil gerbil : gerbils) {
            gerbil.hop();
//            System.out.println("Выполнен hop " + gerbil.gerbilNumber);
        }

        for (int i = 0; i < gerbils.size(); i++) {
            Gerbil gerbil = gerbils.get(i);
            gerbil.hop();

        }
//        Cage<Parrot> cageWithParrot = new Cage <>(new Parrot());
//        Parrot dweller = cageWithParrot.getDweller();

//        Cage<Gerbil> cageWithGerbil = new Cage <Gerbil>(new Gerbil(67));
//        Gerbil dweller1 = cageWithGerbil.getDweller();
    }

    public void testEx2p331() {
        NamesGenerator namesGenerator = new NamesGenerator();
        ArrayList <String> names = new ArrayList <>();
        for (int i = 0; i < 10; i++) {
            names.add(namesGenerator.next());
        }
        for (String name : names) {
            System.out.println("name = " + name);
        }
    }

    public void testEx7p336() {
        Ex7p336[] ex7p336s = new Ex7p336[4];
        ex7p336s[0] = new Ex7p336();
        ex7p336s[1] = new Ex7p336();
        ex7p336s[2] = new Ex7p336();
        ex7p336s[3] = new Ex7p336();
        for (Ex7p336 ex7p336 : ex7p336s) {
            System.out.println(ex7p336.toString());
        }
        List <Ex7p336> ex7p336List = new ArrayList <>();
        ex7p336List.add(0, ex7p336s[0]);
        ex7p336List.add(1, ex7p336s[1]);
        ex7p336List.add(2, ex7p336s[2]);
        ex7p336List.add(3, ex7p336s[3]);
        System.out.println("ex7p336List = " + ex7p336List);
        List <Ex7p336> ex7p336List_sub = ex7p336List.subList(0, 3);
        System.out.println("ex7p336List_sub = " + ex7p336List_sub);
        ex7p336List.removeAll(ex7p336List_sub);
        System.out.println("ex7p336List = " + ex7p336List);
        Ex7p336 ex7p336 = new Ex7p336();
        System.out.println();
        ex7p336.iterCollection(ex7p336List);
    }

    public void testEx11p339(){
        FromContainerToContainer fromContainerToContainer = new FromContainerToContainer();
        fromContainerToContainer.fromFirstToSecond();
    }

    public void testEx14p341(){
        EmptyLinkedList emptyLinkedList = new EmptyLinkedList();
        emptyLinkedList.addToEmtyinMiddle(10);
    }

    public void testEx16p346(){
        Vowel vowel = new Vowel();
        vowel.countVowels("Hello,Friend!");
        assertEquals(4, vowel.getVowelsCount());
        assertEquals(2, vowel.getWordsCounter());
        System.out.println(vowel.getWord2vowels());
        vowel.countVowels("Putin vs Navalny Fight!");
        assertEquals(6, vowel.getVowelsCount());
        assertEquals(4, vowel.getWordsCounter());
        System.out.println(vowel.getWord2vowels());
        vowel.countVowelsFromFile("C:\\Users\\Anton\\IdeaProjects\\Studing\\src\\sample\\chapter11\\Sample.txt");
        System.out.println(vowel.getWord2vowels());


       }
}
