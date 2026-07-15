package com.testing.oop2.Abstract;

public class Demo01 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat("狗粮");
        d.drink();

        Cat c = new Cat();
        c.eat("猫粮");
        c.drink();
    }
}

abstract class Animal {
    public abstract void eat(String str);

    public abstract void drink();
}

class Dog extends Animal {
    public void eat(String str) {
        System.out.println("狗吃" + str);
    }

    public void drink() {
        System.out.println("狗喝水");
    }
}

class Cat extends Animal {
    public void eat(String str) {
        System.out.println("猫吃" + str);
    }

    public void drink() {
        System.out.println("猫喝水");
    }
}