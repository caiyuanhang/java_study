package com.testing.chapter10.innerClass.TestDemo02;

public class TestDemo02 {
    public static void main(String[] args) {
        StaticClass02.InnerStaticClass01 innerStaticClass01  = new StaticClass02.InnerStaticClass01();
        // 报错：'InnerStaticClass02' 为抽象；无法实例化
        // StaticClass02.InnerStaticClass02 innerStaticClass02  = new StaticClass02.InnerStaticClass02();
    }
}
