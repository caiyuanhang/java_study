package com.testing.flowcontrol.flow.forcircle;

public class Demo16 {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            // 控制行
            for (int col = 0; col < 4; col++) {
                // 控制列
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
