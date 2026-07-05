package com.testing.array;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        int[] numArr = new int[3];
        numArr[0] = 11;
        numArr[1] = 22;
        numArr[2] = 33;
        String[] strArr = new String[3];
        strArr[0] = "AA";
        strArr[1] = "BB";
        strArr[2] = "CC";
        System.out.println("存了数据的整型数组：" + Arrays.toString(numArr));
        System.out.println("存了数据的字符串数组：" + Arrays.toString(strArr));
    }
}
