package com.testing.func;

public class Demo10 {
    public static void main(String[] args) {
        sum(11);
        sum(11, 22);
        sum(11, 2.2);
        sum(1.1, 22);
    }

    public static void sum(int a) {
        System.out.println(a);
    }

    // 参数个数不同
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    // 参数类型不同
    public static void sum(int a, double b) {
        System.out.println(a + b);
    }

    // 参数类型顺序不同
    public static void sum(double a, double b) {
        System.out.println(a + b);
    }
}
