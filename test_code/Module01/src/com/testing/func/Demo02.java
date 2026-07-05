package com.testing.func;

public class Demo02 {
    public static void main(String[] args) {
        sum(10, 20);
    }

    public static void sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("有参无返回值==" + sum);
    }
}
