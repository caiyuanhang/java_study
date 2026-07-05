package com.testing.array;

import java.util.Arrays;

public class Demo18 {
    public static void main(String[] args) {
        int[] numA = {1, 2, 3};
        int[] numB = {11, 22, 33};
        int[] numSum = new int[numA.length + numB.length];
        for (int i = 0; i < numSum.length; i++) {
            if (i < numA.length) {
                numSum[i] = numA[i];
            } else {
                numSum[i] = numB[i - 3];
            }
        }
        System.out.println("numA：" + Arrays.toString(numA) + "，numB：" + Arrays.toString(numB) + "，numSum：" + Arrays.toString(numSum));
    }
}
