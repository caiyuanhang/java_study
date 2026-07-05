package com.testing.oop.expansionKnowledge.Demo01_rest;

public class Demo01Test {
    static void main() {
        restMethod(1, 2, 3, 4, 5);
    }

    public static void restMethod(int... rest) {
        int sum = 0;
        for (int i : rest) {
            sum += i;
        }
        System.out.println("sum==" + sum);
    }
}
