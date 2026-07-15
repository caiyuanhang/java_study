package com.testing.oop2.Extends.Demo03ExtendsMethodOverriding.ApplySenario1;

public class ApplySenario1 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.makeSound(); // 输出：汪汪汪

        Animal a2 = new Cat();
        a2.makeSound(); // 输出：喵喵喵
    }
}
