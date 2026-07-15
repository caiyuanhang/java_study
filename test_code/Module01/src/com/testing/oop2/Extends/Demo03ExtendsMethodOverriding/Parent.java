package com.testing.oop2.Extends.Demo03ExtendsMethodOverriding;

public class Parent {
    public void parentFn() {
        System.out.println("Parent 的 parentFn 方法");
    }

    public void fn() {
        System.out.println("Parent 的 fn 方法");
    }

    private Parent fn1(){
        System.out.println("Parent 的 fn 方法");
        return null;
    };
}
