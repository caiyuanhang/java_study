package com.testing.oop2.Polymorphic.DemoTest03;

public class DemoTest03 {
    public static void main(String[] args) {
        DemoTest03 demoTest03 = new DemoTest03();
        Dog d = new Dog();
        demoTest03.fnDog(d);
        Cat c = new Cat();
        demoTest03.fnCat(c);
        // 原始的 new 方式，会导致如果要在方法中使用继承自 Animal 的子对象中的同名方法，就得创建多个方法，并让形参的类型为该子对象类型
        // 这样方式的扩展性很差
    }

    public void fnDog(Dog d){
        d.eat();
        d.look(); // 可以使用子对象自身特有方法
    }

    public void fnCat(Cat c){
        c.eat();
        c.catchMouse(); // 可以使用子对象自身特有方法
    }

    // ...
}
