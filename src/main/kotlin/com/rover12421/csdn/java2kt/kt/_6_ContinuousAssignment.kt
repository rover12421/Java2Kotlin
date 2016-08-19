package com.rover12421.csdn.java2kt.kt

import java.io.FileInputStream
import java.io.IOException

/**
 * Created by rover12421 on 8/11/16.
 */
object _6_ContinuousAssignment {
    @JvmStatic fun main(args: Array<String>) {
        val a: Int
        val b: Int
        val c: Int
        val d: Int
//        a = b = c = d = 100
        a=100
        b=100
        c=100
        d=100

        println("a=" + a)
        println("b=" + b)
        println("c=" + c)
        println("d=" + d)

        try {
            FileInputStream("test.file").use { fis ->
                var len: Int
                val bytes = ByteArray(1024)
//                while ((len = fis.read(bytes, 0, 1024)) != -1) {
//                    println(len)
//                }
                while (true) {
                    len = fis.read(bytes, 0, 1024)
                    if (len == -1) {
                        break
                    }
                    println(len)
                }
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }
}
