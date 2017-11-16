package sample.chapter3;

/**
 * Copyright (c) Anton on 12.06.2017.
 */
/* Ex. 11 - 13 p.113 */
class OperSdv {
    private final static int A = 0xAAAA;

    static void ex11() {
        int c = A >> 1;
        System.out.println("A =   " + Integer.toBinaryString(A));
        System.out.println("c =   " + Integer.toBinaryString(c));
        int c1 = A >> 2;
        System.out.println("c1 =  " + Integer.toBinaryString(c1));
        int c2 = A >> 3;
        System.out.println("c2 =  " + Integer.toBinaryString(c2));
        int c3 = A >> 4;
        System.out.println("c3 =  " + Integer.toBinaryString(c3));
        int c4 = A >> 5;
        System.out.println("c4 =  " + Integer.toBinaryString(c4));
        int c5 = A >> 6;
        System.out.println("c5 =  " + Integer.toBinaryString(c5));
        int c6 = A >> 7;
        System.out.println("c6 =  " + Integer.toBinaryString(c6));
        int c7 = A >> 8;
        System.out.println("c7 =  " + Integer.toBinaryString(c7));
        int c8 = A >> 9;
        System.out.println("c8 =  " + Integer.toBinaryString(c8));
        int c9 = A >> 10;
        System.out.println("c9 =  " + Integer.toBinaryString(c9));
        int c10 = A >> 11;
        System.out.println("c10 = " + Integer.toBinaryString(c10));
        int c11 = A >> 12;
        System.out.println("c11 = " + Integer.toBinaryString(c11));
        int c12 = A >> 13;
        System.out.println("c12 = " + Integer.toBinaryString(c12));
        int c13 = A >> 14;
        System.out.println("c13 = " + Integer.toBinaryString(c13));
        int c14 = A >> 15;
        System.out.println("c14 = " + Integer.toBinaryString(c14));


    }

    static void ex12() {
        int i = 0xFFFF;
        int i1 = i << 1;
        System.out.println("i   = " + Integer.toBinaryString(i));
        System.out.println("i1  = " + Integer.toBinaryString(i1));
        int i2 = i1 >> 1;
        System.out.println("i2  = " + Integer.toBinaryString(i2));
        int i3 = i1 >> 2;
        System.out.println("i3  = " + Integer.toBinaryString(i3));
        int i4 = i1 >> 3;
        System.out.println("i4  = " + Integer.toBinaryString(i4));
        int i5 = i1 >> 4;
        System.out.println("i5  = " + Integer.toBinaryString(i5));
        int i6 = i1 >> 5;
        System.out.println("i6  = " + Integer.toBinaryString(i6));
        int i7 = i1 >> 6;
        System.out.println("i7  = " + Integer.toBinaryString(i7));
        int i8 = i1 >> 7;
        System.out.println("i8  = " + Integer.toBinaryString(i8));
        int i9 = i1 >> 8;
        System.out.println("i9  = " + Integer.toBinaryString(i9));
        int i10 = i1 >> 9;
        System.out.println("i10 = " + Integer.toBinaryString(i10));
        int i11 = i1 >> 10;
        System.out.println("i11 = " + Integer.toBinaryString(i11));
        int i12 = i1 >> 11;
        System.out.println("i12 = " + Integer.toBinaryString(i12));
        int i13 = i1 >> 12;
        System.out.println("i13 = " + Integer.toBinaryString(i13));
        int i14 = i1 >> 13;
        System.out.println("i14 = " + Integer.toBinaryString(i14));
        int i15 = i1 >> 14;
        System.out.println("i15 = " + Integer.toBinaryString(i15));
        int i16 = i1 >> 15;
        System.out.println("i16 = " + Integer.toBinaryString(i16));
        int i17 = i1 >> 16;
        System.out.println("i17 = " + Integer.toBinaryString(i17));


    }

    static void charToBinary() {
        char i = 'x';
        System.out.println("i = " + i);
        int i1 = Character.getNumericValue(i);
        System.out.println("i1 = " + Integer.toBinaryString(i1));
    }

}
