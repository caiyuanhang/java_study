package com.testing.oop2.Extends.Demo03ExtendsMethodOverriding;

public class Demo03ExtendsMethodOverridingTest01 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.parentFn();
        p.fn();

        System.out.println("-------------------------");

        Children c = new Children();
        c.parentFn(); // Children 类没有该方法，则往父类 Parent 上查找
        c.childFn();
        c.fn(); // 方法名和参数列表相同，则重写方法
    }
}
