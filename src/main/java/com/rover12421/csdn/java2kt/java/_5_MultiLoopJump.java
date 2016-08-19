package com.rover12421.csdn.java2kt.java;

import java.io.*;

/**
 * Created by rover12421 on 8/10/16.
 */
public class _5_MultiLoopJump {
    public static void main(String[] args) {
        int max = 10;
        while (max-- > 0) {
            try(
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    PrintStream ps = new PrintStream(baos)
                    ) {
                try {
                    if (max == 2) {
                        break;
                    }
                }catch (Throwable e2) {
                    e2.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("max == " + max);
    }
}
