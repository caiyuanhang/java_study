package com.testing.oop.Demo03;

public class Demo03 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "姚明";
        person.eat();

        new Person().eat();
    }
}
