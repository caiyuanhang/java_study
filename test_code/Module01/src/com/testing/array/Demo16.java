package com.testing.array;

public class Demo16 {
    public static void main(String[] args) {
        int[] oldNums = {22, 33, 44, 55};
        int[] newNums = new int[4];
        for (int i = 0; i < oldNums.length; i++) {
            newNums[i] = oldNums[i];
        }
        for (int i = 0; i < newNums.length; i++) {
            System.out.println("新数组索引" + i + "的值：" + newNums[i]);
        }
    }
}
