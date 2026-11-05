package com.testing.chapter10.innerClass.TestDemo01;

public class TestDemo01 {
    public static void main(String[] args) {
        StaticClass01.InnerStaticClass01 innerStaticClass01 = new StaticClass01.InnerStaticClass01();
        StaticClass01.InnerStaticClass02 innerStaticClass02 = new StaticClass01.InnerStaticClass02();
        StaticClass01.InnerStaticClass03 innerStaticClass03 = new StaticClass01.InnerStaticClass03();
        // 报错：'InnerStaticClass04' 在 'StaticClass01' 中具有 private 访问权限
        // StaticClass01.InnerStaticClass04 innerStaticClass04 = new StaticClass01.InnerStaticClass04();
    }
}
