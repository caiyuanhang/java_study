package com.testing.flowcontrol.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        System.out.println("nextInt空格后面的内容不会打印出来 == " + res);
    }
}
