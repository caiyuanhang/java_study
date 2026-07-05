package com.testing.func;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(num);
    }

    public  static void print(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("我爱学习，第" + (i + 1) + "遍");
        }
    }
}

