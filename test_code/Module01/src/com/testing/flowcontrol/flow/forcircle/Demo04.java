package com.testing.flowcontrol.flow.forcircle;

public class Demo04 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("1-100 的偶数个数为 == " + count);
    }
}
