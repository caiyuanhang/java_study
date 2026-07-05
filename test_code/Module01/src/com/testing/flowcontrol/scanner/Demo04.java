package com.testing.flowcontrol.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("next空格后面的内容不会打印出来 == " + str);
    }
}
