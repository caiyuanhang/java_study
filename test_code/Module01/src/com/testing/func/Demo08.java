package com.testing.func;

public class Demo08 {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3};
        mapArr(numArr);
    }

    public static void mapArr(int[] numArr) {
        for (int j : numArr) {
            System.out.println("在方法中遍历数组：" + j);
        }
    }
}
