package com.rover12421.csdn.java2kt.java;

/**
 * Created by rover12421 on 8/11/16.
 */
public class _7_NegativeLiteral {
    public static int covertKt(int x){
        String compX = Integer.toBinaryString(x);
        if (x < 0) {
            compX = "-" + Integer.toHexString(~x+1);
        }

        System.out.println("x(" + Integer.toHexString(x) + ") covertKt is " + compX);
        return Integer.parseInt(compX, 16);
    }

    public static void main(String[] args) {
        int a =  0x80000001;
        int b = -0x7FFFFFFF;
        System.out.println("a==b ?= " + (a == b));

        long al =  0x8000000000000001L;
        long bl = -0x7fffffffffffffffL;
        System.out.println("al==bl ?= " + (al == bl));

        System.out.println("a = covertKt(a) ?= " + (a == covertKt(a)));
    }
}
