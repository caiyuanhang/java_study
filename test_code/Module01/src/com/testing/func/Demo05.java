package com.testing.func;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res = isEven(num);
        System.out.println(num + "是：" + res);
    }

    public static String isEven(int num) {
        return num % 2 == 0 ? "偶数" : "奇数";
    }
}


