package com.testing.oop2.Polymorphic.DemoTest05;

public class DemoTest05 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        // a.look(); // 报错：无法解析 'Animal' 中的方法 'look'
        Dog d = (Dog) a;
        d.look(); // 强转之后就能使用 Dog 自有的 look 方法。
    }
}
