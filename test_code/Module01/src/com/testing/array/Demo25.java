package com.testing.array;

import java.util.Arrays;

public class Demo25 {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][];
        arr1[1] = new int[]{1, 2, 3};
        arr1[2] = new int[3];
        arr1[2][1] = 100;
        System.out.println("arr1是：" + Arrays.deepToString(arr1));
    }
}
