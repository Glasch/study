package sample.excercises;

import junit.framework.TestCase;

import java.math.BigInteger;

/**
 * Copyright (c) Anton on 15.11.2017.
 */
public class TestTheFableOfLemons extends TestCase {

    public void testTFoLS() {
        int k = 40;
        for (int i = k; i >=0 ; i--) {
            for (int j = 1; j <= k; j++) {
                long startTime = System.currentTimeMillis();

                if (i >= j) {
                    System.out.print("ВХОДНЫЕ ДАННЫЕ " + i + " " + j);
              //      TheFableOfLemonsStupid theFableOfLemonsStupid = new TheFableOfLemonsStupid(i, j);
              //    BigInteger stupid = theFableOfLemonsStupid.testTFoL();
                   //  System.out.println(theFableOfLemonsStupid.testTFoL());
                    TheFableOfTheLemons3 theFableOfTheLemons3 = new TheFableOfTheLemons3();
                    BigInteger clever = theFableOfTheLemons3.countVariants(i, j);
                    //System.out.println(clever);

//                    if (!stupid.equals(clever)) {
//                        System.out.println("---------------------------------------");
//                        System.out.println("n = " + i + " k =  " + j);
//                        System.out.println("True Result = " + stupid);
//                        System.out.println("I count = " + clever);
////                    }
//
//                    }else
//                    {
                        long timeSpent = System.currentTimeMillis() - startTime;
                        System.out.println(" Correct!" + " " + timeSpent + " мс ");
//                    }
                }
            }
        }}

   public void testVarints(){

        TheFableOfLemonsStupid theFableOfLemonsStupid = new TheFableOfLemonsStupid(6,1);
       System.out.println(theFableOfLemonsStupid.testTFoL());
        TheFableOfTheLemons theFableOfTheLemons = new TheFableOfTheLemons();
       System.out.println(theFableOfTheLemons.countVariants(6,1));
   }

   public void testTFoL3(){
       TheFableOfTheLemons3 thaFableOfTheLemons3 = new TheFableOfTheLemons3();
       long startTime = System.currentTimeMillis();
        BigInteger res = thaFableOfTheLemons3.countVariants(31, 1);
       long timeSpent = System.currentTimeMillis() - startTime;
       System.out.println(res  + " " + timeSpent + "  мс ");
   }

}






