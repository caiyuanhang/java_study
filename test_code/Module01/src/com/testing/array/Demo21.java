package com.testing.array;

public class Demo21 {
    public static void main(String[] args) {
        // 通过 二维数组.length 就可以直接获取二维数组的长度
        String[][] arr = {{"A", "B"}, {"C"}, {"D", "E", "F"}};
        System.out.println("二维数组的长度==" + arr.length);

        // 如果要获取二维数组中的一维数组长度，则需要遍历二维数组获取其中的一维数组，然后通过 一维数组.length 可直接获取一维数组的长度。
        for (int i = 0; i < arr.length; i++) {
            System.out.println("下标为 " + i + " 的一维数组的长度是==" + arr[i].length);
        }
    }
}
