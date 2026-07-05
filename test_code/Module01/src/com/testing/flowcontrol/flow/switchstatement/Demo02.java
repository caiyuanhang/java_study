package com.testing.flowcontrol.flow.switchstatement;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份：");
        int month = sc.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(month + " 对应的季节是冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month + " 对应的季节是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + " 对应的季节是夏季");
                break;
            case 9:
            case 10:
            case 21:
                System.out.println(month + " 对应的季节是秋季");
                break;
        }
    }
}
