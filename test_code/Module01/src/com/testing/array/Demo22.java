package com.testing.array;

import java.util.Arrays;

public class Demo22 {
    public static void main(String[] args) {
        String[][] arr = new String[3][3];
        arr[0][0] = "111";
        arr[0][1] = "222";
        arr[1][1] = "333";
        System.out.println(Arrays.deepToString(arr));
    }
}
