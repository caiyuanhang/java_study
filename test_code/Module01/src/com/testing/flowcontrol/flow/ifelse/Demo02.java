package com.testing.flowcontrol.flow.ifelse;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();
        if (data1 == data2) {
            System.out.println("data1等于data2");
        } else {
            System.out.println("data1不等于data2");
        }
    }
}
