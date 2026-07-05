package com.testing.flowcontrol.flow.ifelse;

import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();
        if (data1 > data2) {
            System.out.println("data1 最大 == " + data1);
        } else if (data1 < data2) {
            System.out.println("data2 最大 == " + data2);
        } else {
            System.out.println("data1 和 data2 相等");
        }
    }
}
