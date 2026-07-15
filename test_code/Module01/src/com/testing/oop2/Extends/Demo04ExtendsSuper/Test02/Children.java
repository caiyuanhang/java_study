package com.testing.oop2.Extends.Demo04ExtendsSuper.Test02;

public class Children extends Parent {
    String name = "Children class";

    public Children() {
        super();
        System.out.println("Children 的无参构造方法");
    }

    public Children(int num) {
        super(num);
        System.out.println("Children 的有参构造方法" + num);
    }

    public void fn() {
        System.out.println("Children 的 fn 方法");
        super.fn(); // 调用父类的成员方法
        String allName = "Children 的 name==" + name + "，Parent 的 name==" + super.name; // 调用父类的成员属性
        System.out.println(allName);
    }
}
