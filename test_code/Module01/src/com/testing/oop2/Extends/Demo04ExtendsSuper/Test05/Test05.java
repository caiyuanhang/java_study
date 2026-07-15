package com.testing.oop2.Extends.Demo04ExtendsSuper.Test05;

public class Test05 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("老大");
        t.setAge(20);
        System.out.println("通过继承的父类的 set 方法为父类私有属性赋值：name==" + t.getName() + "，age==" + t.getAge());

        Manager m = new Manager("老二", 18);
        System.out.println("通过子类构造方法为父类私有属性赋值：name==" + m.getName() + "，age==" + m.getAge());
    }
}
