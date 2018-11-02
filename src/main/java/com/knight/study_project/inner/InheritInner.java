package com.knight.study_project.inner;

/**
 * 内部类的继承
 * @Author: knight
 * @Date: 2018/11/2 下午3:38
 */

class WithInner{
    class inner{

    }
}
public class InheritInner extends WithInner.inner{
    InheritInner(WithInner inner){
        inner.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner inheritInner = new InheritInner(wi);
    }
}
