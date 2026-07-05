package com.testing.flowcontrol.flow.ifelse;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int workDay = sc.nextInt();
        if (workDay < 1 || workDay > 5) {
            System.out.println("没有这个工作日");
        } else {
            if (workDay == 1) {
                System.out.println("星期一");
            } else if (workDay == 2) {
                System.out.println("星期二");
            } else if (workDay == 3) {
                System.out.println("星期三");
            } else if (workDay == 4) {
                System.out.println("星期四");
            } else if (workDay == 5) {
                System.out.println("星期五");
            }
        }
    }
}
