package com.testing.flowcontrol.random;

import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt(10);
        System.out.println("在 10 范围内random一个整数 == " + result);
    }
}
