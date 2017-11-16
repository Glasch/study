package sample.chapter6.nameconflict;

import sample.chapter6.Vector;

/**
 * Copyright (c) Anton on 10.08.2017.
 */
public class ExtendProtected extends Vector {
    void extendProtected(){
        int x = protectedVar;
//        Singleton singleton = new Singleton();

        Singleton instance = Singleton.getInstance();
    }
}
