package com.rover12421.csdn.java2kt.java;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by rover12421 on 8/10/16.
 */
public class _1_CharNumberAttrib {
    public static void main(String[] args) {
        char ch = 'a';
        try (
                ByteArrayOutputStream baos = new ByteArrayOutputStream()
        ) {
            baos.write(ch);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
