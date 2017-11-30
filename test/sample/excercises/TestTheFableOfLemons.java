package sample.excercises;

import junit.framework.TestCase;

import java.math.BigInteger;

/**
 * Copyright (c) Anton on 15.11.2017.
 */
public class TestTheFableOfLemons extends TestCase {

    public void testTFoLS() {
        int k = 15;
        for (int i = k; i >=0 ; i--) {
            for (int j = 1; j <= k; j++) {

                if (i >= j) {
                   // System.out.println("ВХОДНЫЕ ДАННЫЕ " + i + " " + j);
                    TheFableOfLemonsStupid theFableOfLemonsStupid = new TheFableOfLemonsStupid(i, j);
                    BigInteger stupid = theFableOfLemonsStupid.testTFoL();
                  //  System.out.println(theFableOfLemonsStupid.testTFoL());
                    TheFableOfTheLemons3 theFableOfTheLemons3 = new TheFableOfTheLemons3(i,j);
                    BigInteger clever = theFableOfTheLemons3.countVariants();
                    //System.out.println(clever);

                    if (!stupid.equals(clever)){
                        System.out.println("---------------------------------------");
                        System.out.println("n = " + i + " k =  " + j);
                        System.out.println("True Result = " + stupid);
                        System.out.println("I count = " + clever);
                    }

                }
            }
        }
    }

   public void testVarints(){

        TheFableOfLemonsStupid theFableOfLemonsStupid = new TheFableOfLemonsStupid(6,1);
       System.out.println(theFableOfLemonsStupid.testTFoL());
        TheFableOfTheLemons theFableOfTheLemons = new TheFableOfTheLemons();
       System.out.println(theFableOfTheLemons.countVariants(6,1));
   }

   public void testTFoL3(){

       TheFableOfTheLemons3 thaFableOfTheLemons3 = new TheFableOfTheLemons3(6, 1);
       System.out.println(thaFableOfTheLemons3.countVariants());

   }

}






