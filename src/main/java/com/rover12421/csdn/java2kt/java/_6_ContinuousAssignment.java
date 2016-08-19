package com.rover12421.csdn.java2kt.java;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by rover12421 on 8/11/16.
 */
public class _6_ContinuousAssignment {
    public static void main(String[] args) {
        int a,b,c,d;
        a=b=c=d=100;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);

        try {
            try(
                    FileInputStream fis = new FileInputStream("test.file")
                ) {
                int len;
                byte[] bytes = new byte[1024];
                while ((len = fis.read(bytes, 0, 1024)) != -1) {
                    System.out.println(len);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
