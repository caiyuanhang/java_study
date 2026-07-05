package com.testing.array;

public class Demo09 {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]：" + arr[i]);
        }
        System.out.println("arr[3] 已经超出了 arr 的长度范围：" + arr[3]);
    }
}
