package com.testing.oop2.Polymorphic.DemoTest06;

public class DemoTest06_1 {
    public static void main(String[] args) {
        Animal06_1 d = new Dog06_1();
        fn(d);
        Animal06_1 c = new Cat06_1();
        fn(c);
        // 报错：class Cat06_1 cannot be cast to class Dog06_1
        // Cat06_1 和 Dog06_1 是平级的兄弟类，没有继承关系，无法强转
    }

    public static void fn(Animal06_1 a){
        a.eat();
        Dog06_1 d = (Dog06_1) a;
        d.look();
    }
}

abstract class Animal06_1 {
    public abstract void eat();
}

class Dog06_1 extends Animal06_1 {
    public void eat() {
        System.out.println("狗吃狗粮");
    }

    public void look() {
        System.out.println("Dog guarding the house");
    }
}

class Cat06_1 extends Animal06_1 {
    public void eat() {
        System.out.println("猫吃猫粮");
    }

    public void catchMouse() {
        System.out.println("Catch the mouse");
    }
}