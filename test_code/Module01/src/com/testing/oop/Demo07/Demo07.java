package com.testing.oop.Demo07;

public class Demo07 {
    static void main() {
        Human h1 = new Human();
        System.out.println("h1--name：" + h1.name + "，age：" + h1.age);

        Human h2 = new Human("韩立");
        System.out.println("h2--name：" + h2.name + "，age：" + h2.age);

        Human h3 = new Human(280);
        System.out.println("h3--name：" + h3.name + "，age：" + h3.age);

        Human h4 = new Human("韩道友", 280);
        System.out.println("h4--name：" + h4.name + "，age：" + h4.age);
    }
}
