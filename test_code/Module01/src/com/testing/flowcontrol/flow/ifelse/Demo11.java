package com.testing.flowcontrol.flow.ifelse;

import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 0 || age > 130) {
            System.out.println("年龄不符合实际！");
        } else {
            if (age <= 6) {
                System.out.println(age + "岁为婴儿期。");
            } else if (age <= 12) {
                System.out.println(age + "岁为少儿期。");
            } else if (age <= 17) {
                System.out.println(age + "岁为青少期。");
            } else if (age <= 45) {
                System.out.println(age + "岁为青年期。");
            } else if (age <= 69) {
                System.out.println(age + "岁为中年期。");
            } else {
                System.out.println(age + "岁为老年期。");
            }
        }
    }
}
