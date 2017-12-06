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
                    System.out.println("ВХОДНЫЕ ДАННЫЕ " + i + " " + j);
                    TheFableOfLemonsStupid theFableOfLemonsStupid = new TheFableOfLemonsStupid(i, j);
//                    BigInteger stupid = theFableOfLemonsStupid.testTFoL();
                  //  System.out.println(theFableOfLemonsStupid.testTFoL());
                    TheFableOfTheLemons3 theFableOfTheLemons3 = new TheFableOfTheLemons3();
                    BigInteger clever = theFableOfTheLemons3.countVariants(i,j);
                    //System.out.println(clever);

//                    if (!stupid.equals(clever)){
                        System.out.println("---------------------------------------");
                        System.out.println("n = " + i + " k =  " + j);
//                        System.out.println("True Result = " + stupid);
                        System.out.println("I count = " + clever);
//                    }

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
        TheFableOfTheLemons3 thaFableOfTheLemons3 = new TheFableOfTheLemons3();
        System.out.println(thaFableOfTheLemons3.countVariants(6, 1));
    }

    public void testTFoL4(){
        int n = 1000;
        int k = 5;

//        TheFableOfLemonsStupid theFableOfLemonsStupid = new TheFableOfLemonsStupid(n,k);
//        System.out.println("STUPID " + theFableOfLemonsStupid.testTFoL());

//        TheFableOfTheLemons3 thaFableOfTheLemons3 = new TheFableOfTheLemons3();
//        System.out.println("FTL3 " + thaFableOfTheLemons3.countVariants(n, k));

        TheFableOfLemons4 lemons4 = new TheFableOfLemons4();
        long t = System.currentTimeMillis();
        BigInteger full = lemons4.countVariants(n, k);
        System.out.println("FTL4 " + full);
        System.out.println("Time: " + (System.currentTimeMillis()-t));
        System.out.println("Memory Mb: " + (Runtime.getRuntime().totalMemory()/1024/1024));
    }

    public void testTFoL3_Perf(){
        TheFableOfTheLemons3 thaFableOfTheLemons3 = new TheFableOfTheLemons3();
        long t = System.currentTimeMillis();
        BigInteger full = thaFableOfTheLemons3.countVariants(10, 1);
        System.out.println(full);
        System.out.println("Time: " + (System.currentTimeMillis()-t));
        System.out.println("Memory Mb: " + (Runtime.getRuntime().totalMemory()/1024/1024));

    }

}






