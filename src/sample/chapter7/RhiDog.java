package sample.chapter7;

/**
 * Copyright (c) Anton on 31.08.2017.
 */
public class RhiDog {
   private Rhino rhino = new Rhino();
   private Bulldog bulldog = new Bulldog() ;

    void bark(){
        bulldog.bark();
    }

    void impale(){
        rhino.impale();
    }

    public Rhino getRhino() {
        return rhino;
    }

    public Bulldog getBulldog() {
        return bulldog;
    }
}
