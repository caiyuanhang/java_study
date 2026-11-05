package com.testing.chapter10.innerClass.TestDemo02;

public class StaticClass02 {
    public static final class InnerStaticClass01 {
        public InnerStaticClass01(){
            System.out.println("内部 final 类 InnerStaticClass01");
        }
    }

    protected static abstract class InnerStaticClass02 {
        public InnerStaticClass02(){
            System.out.println("内部 abstract 类 InnerStaticClass02");
        }
    }

    // 报错：无法继承自 final 类 'InnerStaticClass03'
    // class InnerStaticClass03 extends InnerStaticClass01 {}
}
