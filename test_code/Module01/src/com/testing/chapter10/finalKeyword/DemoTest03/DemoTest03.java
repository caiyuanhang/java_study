package com.testing.chapter10.finalKeyword.DemoTest03;

public class DemoTest03 {
    public static void main(String[] args) {
        final int num1 = 10;
        // num1 = 100; // 报错：无法将值赋给 final 变量 'num'

        final int num2;
        num2 = 20; // 第一次赋值
        // num2 = 200; // 报错：可能已分配变量 num2
    }
}
