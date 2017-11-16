package sample.chapter4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) Anton on 19.07.2017.
 */
class Fibonacci {
    static List<BigDecimal> findFiboNumbers(int howMuchNumbers) {
        ArrayList<BigDecimal> res = new ArrayList <>();
        BigDecimal firstNumber = new BigDecimal(0);
        BigDecimal secondNumber = new BigDecimal(1);
        res.add(secondNumber);
        for (int i = 1; i <= howMuchNumbers - 1; i++) {
            BigDecimal d = firstNumber.add(secondNumber);
            res.add(d);
            firstNumber = secondNumber;
            secondNumber = d;
        }
        return res;
    }
}
