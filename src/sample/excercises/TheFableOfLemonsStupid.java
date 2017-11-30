package sample.excercises;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Copyright (c) Anton on 23.11.2017.
 */
public class TheFableOfLemonsStupid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        TheFableOfLemonsStupid theFableOfLemonsStupid = new TheFableOfLemonsStupid(n,k);
        System.out.println(theFableOfLemonsStupid.testTFoL());
    }

    private boolean[] variant;
    private int k, n;
    private BigInteger sum;

    public TheFableOfLemonsStupid(int n, int k) {
        this.k = k;
        this.n = n;
    }

    public BigInteger testTFoL() {
        sum = BigInteger.ZERO;
        BigInteger all = BigInteger.valueOf(2).pow(n);
        variant = new boolean[n];
        _count(0);
        return sum;
    }

    private void _count(int index) {
        if (index == n) {
            BigInteger tech = isFeasible() ? BigInteger.ONE : BigInteger.ZERO;
            sum = sum.add(tech);
            return;
        }

        variant[index] = true;
        _count(index+1);

        variant[index] = false;
        _count(index+1);
    }

    private boolean isFeasible() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (variant[i]) {
                count++;
                if (count == k + 1) {
                    return false;
                }
            } else {
                count = 0;
            }
        }
        return true;

    }

}



