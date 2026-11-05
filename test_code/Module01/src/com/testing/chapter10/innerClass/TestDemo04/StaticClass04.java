package com.testing.chapter10.innerClass.TestDemo04;

public class StaticClass04 {
    String outerId = "外部类 StaticClass04 的属性";

    public void fn() {
        System.out.println("外部类 StaticClass04 的方法");
    }

    public static class InnerStaticClass01 {
        public InnerStaticClass01() {
            // 报错：无法从 static 上下文引用非 static 字段 'outerId'
            // System.out.println(outerId);
            // 报错：无法从 static 上下文引用非 static 方法 'fn()'
            // fn();
        }
    }
}
