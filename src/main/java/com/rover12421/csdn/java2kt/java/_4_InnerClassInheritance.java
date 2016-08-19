package com.rover12421.csdn.java2kt.java;


import com.rover12421.csdn.java2kt.java._4_.Representer;

/**
 * Created by rover12421 on 8/10/16.
 */
public class _4_InnerClassInheritance extends Representer {

    private class RepresentStringEx extends RepresentString {
        @Override
        public void doSomeThing() {
            super.doSomeThing();
            System.out.println("This doSomeThing from _4_InnerClassInheritance$RepresentStringEx");
        }
    }

    public void callInner_doSomeThing() {
        System.out.println("_4_InnerClassInheritance$RepresentStringEx.doSomeThing :");
        new RepresentStringEx().doSomeThing();
    }

    public static void main(String[] args) {
        new _4_InnerClassInheritance().callInner_doSomeThing();
    }
}
