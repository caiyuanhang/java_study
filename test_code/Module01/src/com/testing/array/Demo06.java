package com.testing.array;

import java.util.Arrays;
import java.util.Random;

public class Demo06 {
    public static void main(String[] args) {
        String[] strArr = new String[3];
        Random rd = new Random();
        for(int i = 0; i < strArr.length; i++) {
            strArr[i] = rd.nextInt(100) + "";
        }
        System.out.println("通过 Random 存数据：" + Arrays.toString(strArr));
    }
}
