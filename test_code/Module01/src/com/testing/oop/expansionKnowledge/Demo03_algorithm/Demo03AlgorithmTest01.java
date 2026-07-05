package com.testing.oop.expansionKnowledge.Demo03_algorithm;

import java.util.Arrays;

public class Demo03AlgorithmTest01 {
    static void main() {
        int[] oddArr = {1, 2, 3, 4, 5};
        System.out.println("oddArr翻转之前==" + Arrays.toString(oddArr) + "。oddArr翻转之后==" + Arrays.toString(reverseArr(oddArr)));
        int[] evenArr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("evenArr翻转之前==" + Arrays.toString(evenArr) + "。evenArr翻转之后==" + Arrays.toString(reverseArr(evenArr)));
        // 注意：Arrays.toString 打印的是字符串，所以前后结果不同，是因为打印成字符串的时候记录的是当前的数组内容，其实原数组已经被改变。
    }

    public static int[] reverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
