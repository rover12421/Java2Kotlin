package com.rover12421.csdn.java2kt.java._4_;

/**
 * Created by rover12421 on 8/10/16.
 */
class SafeRepresenter extends BaseRepresenter {
    protected class RepresentString implements Represent {
        @Override
        public void doSomeThing() {
            System.out.println("doSomeThing from SafeRepresenter");
        }
    }
}
