package com.testing.oop.expansionKnowledge.Demo02_recursion;

public class Demo02RecursionTest02 {
    static void main() {
        method(5);
    }

    public static void method(int num) {
        System.out.println("num==" + num);
        if (num == 1) {
            return;
        }
        num--;
        method(num);
    }
}
