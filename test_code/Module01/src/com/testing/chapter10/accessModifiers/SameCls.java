package com.testing.chapter10.accessModifiers;

public class SameCls {
    public String name1 = "test";
    protected String name2 = "test";
    String name3 = "test";
    private String name4 = "test";

    public void fn() {
        // public、protected、default 和 private 修饰的成员，在同个类中都能访问
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }
}
