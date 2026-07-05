package com.testing.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo20 {
    public static void main(String[] args) {
        // 动态初始化
        String[][] arr1 = new String[2][2];
        String arr2[][] = new String[3][3];
        String[] arr3[] = new String[4][4];
        System.out.println("动态初始化-arr1==" + Arrays.deepToString(arr1));
        System.out.println("动态初始化-arr2==" + Arrays.deepToString(arr2));
        System.out.println("动态初始化-arr3==" + Arrays.deepToString(arr3));

        // 静态初始化
        String[][] arr4 = {{"AA", "BB"}, {"CC"}};
        String arr5[][] = {{"D"}, {"E"}};
        String[] arr6[] = {{"AA", "BB"}, {"CC"}, {"DD", "EE", "FF"}};
        System.out.println("静态初始化-arr4==" + Arrays.deepToString(arr4));
        System.out.println("静态初始化-arr5==" + Arrays.deepToString(arr5));
        System.out.println("静态初始化-arr6==" + Arrays.deepToString(arr6));
    }
}
