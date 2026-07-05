package com.testing.oop.Demo11;

public class Demo11Test01 {
    static void staticMethod() {}

    public void instanceMethod() {
        staticMethod(); // 同个类，直接调用。
        Demo11Test01.staticMethod(); // 或类名调用。
    }
}
