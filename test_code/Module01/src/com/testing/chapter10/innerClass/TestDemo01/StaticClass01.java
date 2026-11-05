package com.testing.chapter10.innerClass.TestDemo01;

public class StaticClass01 {
    public static class InnerStaticClass01 {
        public InnerStaticClass01(){
            System.out.println("内部 public 类 InnerStaticClass01");
        }
    }

    protected static class InnerStaticClass02 {
        public InnerStaticClass02(){
            System.out.println("内部 protected 类 InnerStaticClass02");
        }
    }

    static class InnerStaticClass03 {
        public InnerStaticClass03(){
            System.out.println("内部默认类 InnerStaticClass03");
        }
    }

    private static class InnerStaticClass04 {
        public InnerStaticClass04(){
            System.out.println("内部 private 类 InnerStaticClass04");
        }
    }
}
