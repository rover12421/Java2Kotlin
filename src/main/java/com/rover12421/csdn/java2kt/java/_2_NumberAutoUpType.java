package com.rover12421.csdn.java2kt.java;

/**
 * Created by rover12421 on 8/10/16.
 */
public class _2_NumberAutoUpType {
    public static void main(String[] args) {
        int a = 100;
        short b = 2;
        char c = 'a';
        long l = 99;

        System.out.println("a | b = " + (a | b));
        System.out.println("b + c = " + (b + c));
        System.out.println("a & c = " + (a & c));
        System.out.println("a ^ l = " + (a ^ l));
    }
}
