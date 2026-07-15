package com.testing.oop2.Extends.Demo04ExtendsSuper.Test02;

public class Parent {
    String name = "Parent class";

    public Parent() {
        System.out.println("Parent 的无参构造方法");
    }

    public Parent(int num) {
        System.out.println("Parent 的有参构造方法" + num);
    }

    public void fn() {
        System.out.println("Parent 的 fn 方法");
    }
}
