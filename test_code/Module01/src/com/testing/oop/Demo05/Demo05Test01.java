package com.testing.oop.Demo05;

import java.util.Arrays;

public class Demo05Test01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        // 这里的 toString 就是一个封装好的功能，通过外界的参数来与其进行交互
        System.out.println(Arrays.toString(arr));
    }
}
