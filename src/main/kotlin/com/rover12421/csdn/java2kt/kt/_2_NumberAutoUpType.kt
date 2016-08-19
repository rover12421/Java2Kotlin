package com.rover12421.csdn.java2kt.kt

/**
 * Created by rover12421 on 8/10/16.
 */
object _2_NumberAutoUpType {
    @JvmStatic fun main(args: Array<String>) {
        val a = 100
        val b: Short = 2
        val c = 'a'
        val l: Long = 99

        println("a | b = " + (a or b.toInt()))
        println("b + c = " + (b + c.toShort()))
        println("a & c = " + (a and c.toInt()))
        println("a ^ l = " + (a.toLong() xor l))
    }

}
