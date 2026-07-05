package com.testing.flowcontrol.flow.ifelse;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();
        int data3 = sc.nextInt();
        int middle;
        if (data1 > data2) {
            middle = data1;
        } else {
            middle = data2;
        }
        if(middle > data3) {
            System.out.println("最大值为 == " + middle);
        } else {
            System.out.println("最大值为 == " + data3);
        }
    }
}
