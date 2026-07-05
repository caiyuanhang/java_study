package com.testing.oop.expansionKnowledge.Demo05_methodParams;

public class Demo05MethodParamsTest01 {
    static void main() {
        int a = 11;
        int b = 22;
        System.out.println("outer==" + "a: " + a + ", b: " + b);
        add(a, b);
    }

    public static void add(int a, int b) {
        a += 100;
        b += 100;
        System.out.println("inner==" + "a: " + a + ", b: " + b);
    }
}
