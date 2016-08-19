package com.rover12421.csdn.java2kt.kt

import java.io.ByteArrayOutputStream
import java.io.IOException

/**
 * Created by rover12421 on 8/10/16.
 */
object _1_CharNumberAttrib {
    @JvmStatic fun main(args: Array<String>) {
        val ch = 'a'
        try {
            ByteArrayOutputStream().use { baos -> baos.write(ch.toInt()) }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}