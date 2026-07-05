package com.testing.flowcontrol.flow.ifelse;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();
        if (data1 == data2) {
            System.out.println("data1和data2相等");
        }
    }
}
