package com.testing.flowcontrol.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
        int res1 = num1 > num2 ? num1 : num2, res2 = res1 > num3 ? res1 : num3;
        System.out.println("Max值为==" + res2);
    }
}
