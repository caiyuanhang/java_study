package com.testing.array;

public class Demo19 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println("arr 的地址值：" + arr);
        System.out.println("arr 索引 1 的数据：" + arr[1]); // 0
        arr[1] = 100;
        System.out.println("arr 索引 1 的数据：" + arr[1]); // 100
    }
}
