package com.testing.oop.expansionKnowledge.Demo02_recursion;

public class Demo02RecursionTest01 {
    static void main() {
        method(1);
    }

    public static void method(int num) {
        System.out.println("num==" + num);
        num = num + 1;
        if (num == 5) {
            return;
        }
        method(num);
    }
}
