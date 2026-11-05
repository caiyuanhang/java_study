package com.testing.chapter10.codeBlock;

public class DemoTest02 {
    public static void main(String[] args) {
        StaticCodeBlock ccb1 = new StaticCodeBlock();
        StaticCodeBlock ccb2 = new StaticCodeBlock();
        // 静态代码块只在类初始化时执行一次，比如：第一次 new/类名使用成员属性或调用成员方法/子类初始化 的时候
    }
}
