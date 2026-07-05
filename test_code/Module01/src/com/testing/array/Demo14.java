package com.testing.array;

import java.util.Random;
import java.util.ArrayList;

public class Demo14 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] nums = new int[50];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rd.nextInt(100) + 1;
        }
        int count = 0;
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
                numList.add(nums[i]);
            }
        }
        System.out.println("偶数的个数为：" + count + "，偶数为：" + numList);
    }
}
