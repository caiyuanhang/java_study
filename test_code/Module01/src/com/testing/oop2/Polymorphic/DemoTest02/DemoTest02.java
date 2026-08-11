package com.testing.oop2.Polymorphic.DemoTest02;

public class DemoTest02 {
    public static void main(String[] args) {
        Parent c = new Child();
        System.out.println("num==" + c.num);
        c.fn();
    }
}
