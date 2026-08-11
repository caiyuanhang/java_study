package com.testing.oop2.Polymorphic.DemoTest01;

public class DemoTest01 {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.eat();
        // d.look(); // 报错：无法解析 'Animal' 中的方法 'look'

        Animal c = new Cat();
        c.eat();
        // c.catchMouse(); // 无法解析 'Animal' 中的方法 'catchMouse'
    }
}
