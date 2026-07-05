package com.testing.array;

import java.util.Random;

public class Demo12 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(501);
        }
        int count = 0;
        for (int j : arr) {
            if (j % 3 == 0 && j % 5 == 0 && j % 7 != 0) {
                count++;
            }
        }
        System.out.println("满足条件的个数为：" + count);
    }
}
