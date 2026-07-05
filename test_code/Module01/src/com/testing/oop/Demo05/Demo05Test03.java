package com.testing.oop.Demo05;

public class Demo05Test03 {
    public static void main(String[] args) {
        Person p = new Person();
        // p.name
        // p.age
        System.out.println("没有 set name & age 之前，Name==" + p.getName() + "，Age==" + p.getAge() );
        p.setName("鸣人");
        p.setAge(20);
        System.out.println("set name & age 之后，Name==" + p.getName() + "，Age==" + p.getAge());
    }
}
