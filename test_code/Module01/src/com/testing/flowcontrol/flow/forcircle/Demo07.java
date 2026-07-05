package com.testing.flowcontrol.flow.forcircle;

public class Demo07 {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("（while循环）1-100 的偶数和为 == " + sum);
    }
}
