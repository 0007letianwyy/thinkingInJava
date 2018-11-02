package com.knight.study_project.inner;

/**
 * 闭包与回调
 *
 * @Author: knight
 * @Date: 2018/10/29 上午11:47
 */

interface Incrementable {
    void increment();
}

class Calee1 implements Incrementable {
    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Other Operation");
    }

    static void f(MyIncrement increment) {
        increment.increment();
    }
}

class Calee2 extends MyIncrement {
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable {

        @Override
        public void increment() {
            Calee2.this.increment();
        }
    }

    //hook ,钩子
    Incrementable getCallbackRefrence() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackRefrence;

    Caller(Incrementable cbh) {
        callbackRefrence = cbh;
    }

    void go() {
        callbackRefrence.increment();
    }

}

public class CallBbacks {
    public static void main(String[] args) {
        Calee1 calee1 = new Calee1();
        Calee2 calee2 = new Calee2();
        MyIncrement.f(calee2);
        Caller caller1 = new Caller(calee1);
        Caller caller2 = new Caller(calee2.getCallbackRefrence());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}
