package com.testing.oop2.Abstract;

public class Demo02 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("火影");
        t1.work();

        Teacher t2 = new Teacher();
        t2.setName("水影");
        t2.work();
    }
}

abstract class Employee {
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void work();
}

class Teacher extends Employee {
    public Teacher() {
    }

    public Teacher(String name) {
        super(name);
    }

    public void work() {
        System.out.println(this.getName() + "老师在上课");
    }
}