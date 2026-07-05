package com.testing.oop.Demo05;

public class Demo05Test04 {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("对象p1：" + p1);
        p1.findThis("p1"); // this 指向当前对象的地址值

        Person p2 = new Person();
        System.out.println("对象p2：" + p2);
        p2.findThis("p2"); // this 指向当前对象的地址值
    }
}
