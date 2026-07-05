package com.testing.flowcontrol.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("nextLine可以录入包含空格的数据 == " + str);
    }
}
