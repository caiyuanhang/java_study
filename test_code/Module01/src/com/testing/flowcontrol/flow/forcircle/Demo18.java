package com.testing.flowcontrol.flow.forcircle;

import java.util.Random;
import java.util.Scanner;

public class Demo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int num = rd.nextInt(100) + 1;
        while (true) {
            int scNum = sc.nextInt();
            if (scNum > num) {
                System.out.println(scNum + "猜大了，结果为：" + num);
            } else if (scNum < num) {
                System.out.println(scNum + "猜小了，结果为：" + num);
            } else {
                System.out.println("恭喜你猜中了！");
                break;
            }
        }
    }
}
