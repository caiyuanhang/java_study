package com.testing.oop.expansionKnowledge.Demo02_recursion;

public class Demo02RecursionTest03 {
    static void main() {
        int res = method(4);
        System.out.println("res==" + res);
    }

    public static int method(int num) {
        if (num == 1) {
            return num;
        }

        return num * method(num - 1);
    }
}
