package com.testing.oop2.Extends.Demo03ExtendsMethodOverriding.ApplySenario1;

public class Cat extends Animal {
    // 子类重写 makeSound 方法，实现狗叫
    @Override
    public void makeSound() {
        System.out.println("喵喵喵");
    }
}
