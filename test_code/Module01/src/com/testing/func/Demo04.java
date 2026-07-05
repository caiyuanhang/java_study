package com.testing.func;

public class Demo04 {
    public static void main(String[] args) {
        int res = sum(11,22);
        System.out.println("有参有返回值==" + res);
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
