package com.testing.oop2.Polymorphic.DemoTest04;

public class DemoTest04 {
    public static void main(String[] args) {
        Animal d = new Dog();
        fn(d);
        Animal c = new Cat();
        fn(c);
        // 后续有继承子 Animal 的其他子类，都可以用这个方法，而不用重新声明一个函数。
    }

    public static void fn(Animal a) {
        a.eat();
        // a.look();
        // 报错：无法解析 'Animal' 中的方法 'look'。无法使用子对象自身特有方法
        // a.catchMouse();
        // 报错：无法解析 'Animal' 中的方法 'catchMouse'。无法使用子对象自身特有方法
    }
}
