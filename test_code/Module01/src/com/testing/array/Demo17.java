package com.testing.array;

import java.util.Arrays;

public class Demo17 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] newNums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        System.out.println("扩容前的 nums：" + Arrays.toString(nums));
        nums = newNums;
        System.out.println("扩容后的 nums：" + Arrays.toString(nums));
    }
}
