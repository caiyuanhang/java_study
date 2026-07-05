package com.testing.func;

public class Demo03 {
    public static void main(String[] args) {
        int res = sum();
        System.out.println("无参有返回值==" + res);
    }

    public static int sum() {
        int num1 = 30, num2 =40;
        return num1 + num2;
    }
}