package sample.chapter5;

/**
 * Copyright (c) Anton on 03.08.2017.
 */
public class Dog {
    void bark(int lai){
        System.out.println(" Gav-Gav " + lai);
    }

    void bark(char voi){
        System.out.println("O-o-o-o-o " + voi);
    }

    void bark(boolean ryk){
        System.out.println("R-r-r-rrr-r " + ryk);
    }

    void bark(char puk, boolean chikh){
        System.out.println("bah - apchhi " + puk + chikh);
    }

    void bark(boolean chikh, char puk){
        System.out.println("apchhi - bah " + chikh + puk );
    }

}
