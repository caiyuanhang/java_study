package com.testing.oop.expansionKnowledge.Demo01_rest;

public class Demo02Test {
    static void main() {
        restMethod(200, 1, 2, 3, 4, 5);
    }

    public static void restMethod(int first, int... rest) {
        int sum = 0;
        sum += first;
        for (int i : rest) {
            sum += i;
        }
        System.out.println("sum==" + sum);
    }
}
