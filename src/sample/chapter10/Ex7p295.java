package sample.chapter10;

/**
 * Copyright (c) Anton on 21.09.2017.
 */
public class Ex7p295 {
    private  int i = 5;
    private  void metod(){
        System.out.println(i);
           }
    class Inner{
        void innerMetodFirst() {
          i++;
          metod();
      }

      }

    void innerMetodTwo(){
        Inner inner = new Inner();
        inner.innerMetodFirst();

    }
}
