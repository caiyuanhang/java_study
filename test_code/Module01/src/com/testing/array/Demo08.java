package com.testing.array;

public class Demo08 {
    public static void main(String[] args) {
        int[] arr1 = {100, 200, 300};
        String[] arr2 = {"动漫1", "动漫2", "动漫3"};

        // 遍历 arr1
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("遍历 arr1：" + arr1[i]);
        }

        // 遍历 arr2
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("遍历 arr2：" + arr2[i]);
        }
    }
}
