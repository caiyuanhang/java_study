package com.testing.array;

import java.util.Arrays;


public class Demo01 {
    public static void main(String[] args) {
        int[] numArr = new int[5];
        String[] strArr = new String[5];
        System.out.println("动态初始化-整型数组：" + Arrays.toString(numArr));
        System.out.println("动态初始化-字符常数组：" + Arrays.toString(strArr));
    }
}
