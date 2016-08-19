package com.rover12421.csdn.java2kt.kt

import com.rover12421.csdn.java2kt.java._4_.Represent
import com.rover12421.csdn.java2kt.java._4_.Representer


/**
 * Created by rover12421 on 8/10/16.
 *
 * 这是一个比较复杂的内部继承类实现
 *
 * 来源:org.yaml.snakeyaml.representer.Representer
 * 使用:brut.androlib.meta.StringExRepresent
 */
class _4_InnerClassInheritance : Representer() {
    /**
     * RepresentString 是一个package权限类SafeRepresenter里的一个protected内部类
     * 虽然Representer继承了RepresentString,并改成了public权限
     * Kt查找权限依然是按照SafeRepresenter.RepresentString
     * java则识别出Representer对SafeRepresenter的继承
     */
    //    private inner class RepresentStringEx : RepresentString() {
//        override fun doSomeThing() {
//            super.doSomeThing()
//            println("This doSomeThing from _4_InnerClassInheritance\$RepresentStringEx")
//        }
//    }

    private class RepresentStringEx : Represent {
        override fun doSomeThing() {
            /**
             * 这里没法继承RepresentString,所以要调用RepresentString的doSomeThing,只能再实现一次
             */
            //            super.doSomeThing()
            println("doSomeThing from SafeRepresenter")
            println("This doSomeThing from _4_InnerClassInheritance\$RepresentStringEx")
        }
    }

    fun callInner_doSomeThing() {
        println("_4_InnerClassInheritance\$RepresentStringEx.doSomeThing :")
        RepresentStringEx().doSomeThing()
    }
}

fun main(args: Array<String>) {
    _4_InnerClassInheritance().callInner_doSomeThing()
}
