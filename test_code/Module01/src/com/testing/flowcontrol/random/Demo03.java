package com.testing.flowcontrol.random;

import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt(1000) + 100;
        System.out.println("在 100~999 范围内random一个整数 == " + result);
    }
}
