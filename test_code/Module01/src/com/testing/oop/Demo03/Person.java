package com.testing.oop.Demo03;

public class Person {
    String name = "";

    public void eat() {
        if (name.isEmpty()) {
            System.out.println("人要吃饭！");
        } else {
            System.out.println(name + "要吃饭！");
        }
    }
}
