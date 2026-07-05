package com.testing.flowcontrol.flow.switchstatement;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1~4来选择你的技术方向：");
        int data = sc.nextInt();
        switch (data) {
            case 1:
                System.out.println("1 - 对应的方向是：云计算");
                break;
            case 2:
                System.out.println("2 - 对应的方向是：算法");
                break;
            case 3:
                System.out.println("3 - 对应的方向是：网络安全");
                break;
            default:
                System.out.println(data + " - 对应的方向是：全干");
                break;
        }
    }
}
