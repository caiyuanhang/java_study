package com.testing.func;

public class Demo06 {
    public static void main(String[] args) {
        summary();
    }

    public static void summary() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1 到 100 的和是：" + sum);
    }
}
