package com.testing.oop2.Extends.Demo04ExtendsSuper;

public class Test04 {
    public static void main(String[] args) {
        Children c = new Children();
        c.fn01();
    }
}

class Parent {
    public static void fn01() {
        System.out.println("Parent 静态方法 fn01");
    }
}

class Children extends Parent {
}