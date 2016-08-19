package com.rover12421.csdn.java2kt.kt

import com.rover12421.fulvakt.builtins_extension.*

/**
 * Created by rover12421 on 8/10/16.
 */
object _2_NumberAutoUpType_2_ {
    @JvmStatic fun main(args: Array<String>) {
        val a = 100
        val b: Short = 2
        val c = 'a'
        val l: Long = 99

        println("a | b = " + (a or b))
        println("b + c = " + (b + c))
        println("a & c = " + (a and c))
        println("a ^ l = " + (a xor l))
    }
}
