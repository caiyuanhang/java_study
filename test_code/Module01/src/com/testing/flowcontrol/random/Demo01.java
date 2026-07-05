package com.testing.flowcontrol.random;

import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt();
        System.out.println("在int范围内random一个整数 == " + result);
    }
}
