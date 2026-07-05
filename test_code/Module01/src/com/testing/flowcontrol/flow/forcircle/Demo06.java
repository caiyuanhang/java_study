package com.testing.flowcontrol.flow.forcircle;

public class Demo06 {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i <= 3) {
            sum += i;
            i++;
        }
        System.out.println("（while循环）1-3 的和为 == " + sum);
    }
}
