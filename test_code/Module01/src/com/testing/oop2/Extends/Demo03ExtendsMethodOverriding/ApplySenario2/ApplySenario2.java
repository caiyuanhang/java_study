package com.testing.oop2.Extends.Demo03ExtendsMethodOverriding.ApplySenario2;

public class ApplySenario2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.work();

        System.out.println("------------------------");

        Manager m = new Manager();
        m.work();
    }
}
