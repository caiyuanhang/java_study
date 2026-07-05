package com.testing.flowcontrol.flow.ifelse;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("输入的整数是偶数");
        } else {
            System.out.println("输入的整数是奇数");
        }
    }
}
