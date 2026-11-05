package com.testing.chapter10.innerClass.TestDemo03;

public class TestDemo03 {
    public static void main(String[] args) {
        StaticClass03.InnerStaticClass01 innerStaticClass01 = new StaticClass03.InnerStaticClass01();
        System.out.println(innerStaticClass01.name);
        innerStaticClass01.fn();
    }
}
