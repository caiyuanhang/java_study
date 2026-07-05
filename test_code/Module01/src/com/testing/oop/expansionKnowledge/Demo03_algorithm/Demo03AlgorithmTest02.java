package com.testing.oop.expansionKnowledge.Demo03_algorithm;

import java.util.Arrays;

public class Demo03AlgorithmTest02 {
    static void main() {
        int[] num = {11, 123, 21, 83, 15, 8};
        System.out.println("冒泡排序之前==" + Arrays.toString(num) + "。冒泡排序之后==" + Arrays.toString(bubbleSort(num)));

    }

    // 每圈都少比较一次
    public static int[] bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            // 圈次数
            for (int i = 0; i < arr.length - 1 - j; i++) {
                // 每圈比较次数
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        return arr;
    }
}
