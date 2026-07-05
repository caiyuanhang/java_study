package com.testing.flowcontrol.flow.forcircle;

public class Demo02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            sum+=i;
        }
        System.out.println("1-3 的和为 == " + sum);
    }
}
