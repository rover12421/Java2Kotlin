package com.rover12421.csdn.java2kt.kt

/**
 * Created by rover12421 on 8/10/16.
 */
object _3_OperatorPrecedence {
    @JvmStatic fun main(args: Array<String>) {
        println("${1+2*3+4} == ${1+(2*3)+4}")
        println("${1 shl 2 or 2 shl 3} == ${1 shl 2 or (2 shl 3)}") // 1<<2 | 2<<3
        println("${1 shl 2 or 2 shl 3} == ${1.shl(2).or(2).shl(3)}")
    }
}