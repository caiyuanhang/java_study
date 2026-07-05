package com.testing.oop.Demo11;

public class Demo11Test03 {
    static void staticMethod01() {
        staticMethod02();
        Demo11Test03.staticMethod02();
    }

    static void staticMethod02() {}
}
