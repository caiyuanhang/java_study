package com.testing.chapter10.codeBlock;

public class ConstructCodeBlock {
    public ConstructCodeBlock() {
        System.out.println("构造函数");
    }

    {
        System.out.println("构造代码块");
    }
}
