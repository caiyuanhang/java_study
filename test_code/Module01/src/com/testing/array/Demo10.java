package com.testing.array;

public class Demo10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        arr = null;
        System.out.println("arr 空指针异常（arr[0]）==" + arr[0]);
    }
}
