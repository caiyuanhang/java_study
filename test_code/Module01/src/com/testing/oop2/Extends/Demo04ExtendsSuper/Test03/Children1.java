package com.testing.oop2.Extends.Demo04ExtendsSuper.Test03;

public class Children1 {
    public Children1() {
        this("abc123"); // 在无参构造函数中调用有参构造函数
        System.out.println("Children1 的无参构造方法");
    }

    public Children1(String name) {
        System.out.println("Children1 的有参构造方法：" + name);
    }
}
