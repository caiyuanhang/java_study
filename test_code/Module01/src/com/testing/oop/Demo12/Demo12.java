package com.testing.oop.Demo12;

public class Demo12 {
    public static void main(String[] args) {
        int[] nums = {4, 6, 834, 62, 11, 6};
        int max = ArrayUtils.getMax(nums);
        // new ArrayUtils(); // 报错：'ArrayUtils()' 在 'com.testing.oop.Demo12.ArrayUtils' 中具有 private 访问权限
        System.out.println("nums中最大的数字是: " + max);
    }
}
