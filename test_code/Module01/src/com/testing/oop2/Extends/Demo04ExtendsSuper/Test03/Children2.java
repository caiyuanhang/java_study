package com.testing.oop2.Extends.Demo04ExtendsSuper.Test03;

public class Children2 {
    String name = "Children2 class";

    public Children2() {
        System.out.println("Children2 的无参构造方法");
    }

    public Children2(String name) {
         this(); // 在有参构造函数中调用无参构造函数
        System.out.println("Children2 的有参构造方法：" + name);
    }

    public void fn(String name) {
        System.out.println("fn 方法");
        System.out.println("局部变量 name 为：" + name + "，成员变量 name 为：" + this.name);
        this.fn01();
    }

    public void fn01(){
        System.out.println("fn1 方法");
    }
}
