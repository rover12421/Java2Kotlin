package com.rover12421.csdn.java2kt.kt

import java.io.*

/**
 * Created by rover12421 on 8/10/16.
 */
object _5_MultiLoopJump {
    @JvmStatic fun main(args: Array<String>) {
        var max = 10
        var finish = false
        while (!finish && max-- > 0) while1@ {
            try {
                 ByteArrayOutputStream().use use1@ { baos ->
                    PrintStream(baos).use use2@ { ps ->
                        try {
                            if (max == 2) {
                                //没法用break跳出while循环
//                                break
                                //return 也没法直接return到while
//                                return
                                finish = true
                            }
                        } catch (e2: Throwable) {
                            e2.printStackTrace()
                        }
                    }
                }
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }

        println("max == " + max)
    }
}
