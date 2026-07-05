package com.testing.array;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3};
        String[] strArr = {"a", "b", "c"};
        System.out.println("静态初始化-整型数组：" + Arrays.toString(numArr));
        System.out.println("静态初始化-字符串数组：" + Arrays.toString(strArr));
    }
}
