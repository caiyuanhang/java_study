package com.testing.array;

import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {
        int[] nums = {11, 18, 19, 20, 50};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                index = i;
                break;
            }
        }
        System.out.println("键盘输入的整数是：" + num + "，它的索引是：" + (index == -1 ? "未找到" : index));
        sc.close();
    }
}
