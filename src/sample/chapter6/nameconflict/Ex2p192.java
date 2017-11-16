package sample.chapter6.nameconflict;

import sample.chapter6.Vector;

/**
 * Copyright (c) Anton on 10.08.2017.
 */
public class Ex2p192 {
    sample.chapter6.Vector v = new sample.chapter6.Vector();
    void useVars(){
        Vector vector = new Vector();
        int x = vector.publicVar;

    }
}
