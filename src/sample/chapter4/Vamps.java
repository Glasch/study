package sample.chapter4;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) Anton on 27.07.2017.
 */
public class Vamps {
    public static List <VampInfo> findVamps(int digitsCount) {
        if(digitsCount % 2 != 0){
            throw new IllegalArgumentException("Argument must be even!");
        }

        List <VampInfo> res = new ArrayList <>();
        int from = (int) Math.pow(10, digitsCount / 2 - 1);
        int to = (int)Math.pow(10, digitsCount / 2);
        for (int result = (int)Math.pow(10, digitsCount-1); result < Math.pow(10,digitsCount); result++) {
            for (int firstFactor = from; firstFactor < to; firstFactor++) {
                if (result % firstFactor == 0) {
                    int secondFactor = result / firstFactor;
                    if (secondFactor > to - 1 || secondFactor < firstFactor) {
                        continue;
                    }
                    boolean isVamp = checkVamp(result, firstFactor, secondFactor, digitsCount);


                    if (isVamp) {
                        VampInfo vampNumber = initVampInfo(result, firstFactor, secondFactor);
                        res.add(vampNumber);
                    }
                }
            }
        }
        return res;
    }

    private static VampInfo initVampInfo(int result, int firstFactor, int secondFactor) {
        VampInfo vampNumber = new VampInfo();
        vampNumber.result = result;
        vampNumber.firstFactor = firstFactor;
        vampNumber.secondFactor = secondFactor;
        return vampNumber;
    }

    private static boolean checkVamp(int number, int firstFactor, int secondFactor, int digitsCount ) {
        short[] resultArray = toDigitsArray(number,digitsCount);
        int totalFactor = (int) (firstFactor * Math.pow(10, digitsCount/2) + secondFactor);
        short[] factorsArray = toDigitsArray(totalFactor,digitsCount);

        int counter = 0;
        for (int x = 0; x < resultArray.length; x++) {
            for (int y = 0; y < factorsArray.length; y++) {
                if (resultArray[x] == factorsArray[y]) {
                    counter++;
                    factorsArray[y] = 11;
                    break;

                }
            }
        }
        return counter == digitsCount ;
    }
    private  static short[] toDigitsArray(int number, int digitsCount){
        short[] res = new short[digitsCount];
        for (int i = digitsCount-1; i > 0; i-- ){
            double pow = Math.pow(10, i);
            res[digitsCount - i - 1] = (short) (number % pow);
            number -= pow;
        }
        return res;
    }
}
