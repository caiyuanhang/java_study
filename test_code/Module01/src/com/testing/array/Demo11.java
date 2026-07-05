package com.testing.array;

public class Demo11 {
    public static void main(String[] args) {
        int[] arr = {12, 543, 765, 1, 656, 4, 7, 2};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("arr 中的最大值为：" + max);
    }
}
