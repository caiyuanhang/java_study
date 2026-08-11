package com.testing.oop2.Polymorphic.DemoTest06;

public class DemoTest06_2 {
    public static void main(String[] args) {
        Animal06_2 d = new Dog06_2();
        fn(d);
        Animal06_2 c = new Cat06_2();
        fn(c);
    }

    public static void fn(Animal06_2 a) {
        a.eat();
        // 先通过 instanceof 判断类型再强转
        if (a instanceof Dog06_2 d) {
            // 模式匹配写法直接在 instanceof 里声明变量 d，如果 a 是 Dog06_2 类型，就会自动把 a 强转为 Dog06_2 并赋值给 d，就可以直接在 if 代码块里使用 d。
            d.look();
        }
        if (a instanceof Cat06_2) {
            Cat06_2 c = (Cat06_2) a;
            c.catchMouse();
        }

    }
}

abstract class Animal06_2 {
    public abstract void eat();
}

class Dog06_2 extends Animal06_2 {
    public void eat() {
        System.out.println("狗吃狗粮");
    }

    public void look() {
        System.out.println("Dog guarding the house");
    }
}

class Cat06_2 extends Animal06_2 {
    public void eat() {
        System.out.println("猫吃猫粮");
    }

    public void catchMouse() {
        System.out.println("Catch the mouse");
    }
}