package com.testing.func;

import java.util.Arrays;

public class Demo09 {
    public static void main(String[] args) {
        int[] resArr = returnArr();
        System.out.println(Arrays.toString(resArr));
    }

    public static int[] returnArr (){
        int num1 = 22, num2 = 5;
        return new int[]{num1 - num2, num1 + num2};
    };
}
