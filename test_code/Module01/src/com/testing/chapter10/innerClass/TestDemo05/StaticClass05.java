package com.testing.chapter10.innerClass.TestDemo05;

public class StaticClass05 {
    String outerId = "外部类 StaticClass05 的属性";
    private String id = "外部类 StaticClass05 的私有属性";

    public void fn1() {
        System.out.println("外部类 StaticClass05 的 fn1 方法");
    }

    private void fn2() {
        System.out.println("外部类 StaticClass05 的 private fn2 方法");
    }

    public class InnerStaticClass01 {
        public InnerStaticClass01() {
            System.out.println(outerId);
            System.out.println(id);
            fn1();
            fn2();
        }
    }
}
