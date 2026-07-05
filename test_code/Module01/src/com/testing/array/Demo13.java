package com.testing.array;

public class Demo13 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        System.out.print('[');
        for (int i = 0; i < num.length; i++) {
            String printStr = i == num.length - 1 ? "]" : ",";
            System.out.print(num[i] + printStr);
        }
    }
}
