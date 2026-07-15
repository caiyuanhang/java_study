package com.testing.oop2.Extends.Demo03ExtendsMethodOverriding;

public class Children extends Parent {
    public void childFn(){
        System.out.println("Children 的 childFn 方法");
    };

    @Override
    public void fn(){
        System.out.println("Children 的 fn 方法");
    };

    private Children fn1(){
        System.out.println("Parent 的 fn 方法");
        return null;
    }
}
