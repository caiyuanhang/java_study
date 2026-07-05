package com.testing.array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        int[] numArr = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        System.out.println("通过 Scanner 存数据：" + Arrays.toString(numArr));
    }
}
