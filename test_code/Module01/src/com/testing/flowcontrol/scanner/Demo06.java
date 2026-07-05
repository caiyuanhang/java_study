package com.testing.flowcontrol.scanner;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // next 遇到空格就结束，剩余的空格及后面的内容，将会由 nextLine 接收并使用。
        String str1 = sc.next();
        String str2 = sc.nextLine();
        System.out.println("next遇到空格就接收 == " + str1 + "。 nextLine会接收next后面剩余的内容 == " +str2);
    }
}
