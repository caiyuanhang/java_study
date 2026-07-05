package com.testing.oop.Demo07;

public class Human {
    String name;
    int age;

    public Human() {
        System.out.println("Human的有参构造函数-重载函数1-无参");
    }

    public Human(String name) {
        this.name = name;
        System.out.println("Human的有参构造函数-重载函数2-有 name 参数");
    }

    public Human(int age) {
        this.age = age;
        System.out.println("Human的有参构造函数-重载函数3-有 age 参数");
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Human的有参构造函数-重载函数4-有 name 和 age 参数");
    }
}
