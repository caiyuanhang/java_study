package com.testing.flowcontrol.flow.ifelse;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("num1是较大值，num1的值为： " + num1);
        } else {
            System.out.println("num2是较大值，num2的值为： " + num2);
        }
    }
}
