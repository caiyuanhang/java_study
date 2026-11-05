package com.testing.chapter10.innerClass.TestDemo03;

public class StaticClass03 {
    public static class InnerStaticClass01 {
        String name = "内部类 InnerStaticClass01 的 name 属性";

        public void fn() {
            System.out.println("内部类 InnerStaticClass01 的 fn 方法");
        }

        public InnerStaticClass01() {
            System.out.println("内部类 InnerStaticClass01 的构造函数");
        }
    }
}
