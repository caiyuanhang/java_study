package com.testing.array;

import java.util.Arrays;

public class Demo02Test {
    public static void main(String[] args) {
        int[] numArr = new int[3];
        // numArr = {1, 2, 3}; // 这里在 Idea 会报错：此处不允许数组初始值设定项；代码运行之后，同时报错：非法的表达式开始/不是语句/需要;
        numArr = new int[]{1, 2, 3}; // 这种方式才是正确的
        System.out.println("numArr== " + Arrays.toString(numArr));
    }
}
