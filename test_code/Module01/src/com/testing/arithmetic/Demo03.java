package com.testing.arithmetic;

public class Demo03 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int res = num1++ + --num2 + ++num1;
        System.out.println("res == " + res);
    }
}
