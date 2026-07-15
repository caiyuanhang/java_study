package com.testing.oop2.Extends.Demo02ExtendsFeature;

public class Demo02ExtendsFeatureTest02 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.fn();

        Children c = new Children();
        c.fn(); // Children 和 Parent 相同的方法，子类方法会重写父类方法

        // 这里的 fn 方法调用的是 Children 这个类里面的，子类继承父类，对于相同的方法，new 的是哪个类，就调用该类里面对应的方法，不像成员变量，看的是左边的类
        Parent p1 = new Children();
        p1.fn();
    }
}
