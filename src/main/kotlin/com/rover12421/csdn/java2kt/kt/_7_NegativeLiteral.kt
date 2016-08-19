package com.rover12421.csdn.java2kt.kt

import java.math.BigInteger

/**
 * Created by rover12421 on 8/11/16.
 */
object _7_NegativeLiteral {
    @JvmStatic fun main(args: Array<String>) {
        val a:Int = 0x80000001.toInt()
        val b:Int = -0x7FFFFFFF
        println("a==b ?= " + (a == b))

        val al = BigInteger("8000000000000001", 16).toLong()
        val bl = -0x7fffffffffffffffL
        println("al==bl ?= " + (al == bl))

    }
}
