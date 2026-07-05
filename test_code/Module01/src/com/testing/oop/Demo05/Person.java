package com.testing.oop.Demo05;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("您是神仙！");
        } else {
            this.age = age;
        }
    }

    public void findThis(String indicator) {
        System.out.println(indicator + ": " + this);
    }
}
