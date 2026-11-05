package com.testing.chapter10.codeBlock;

public class StaticCodeBlock {
    public StaticCodeBlock() {
        System.out.println("构造函数");
    }

    {
        System.out.println("构造代码块");
    }

    static {
        System.out.println("静态代码块");
    }
}
