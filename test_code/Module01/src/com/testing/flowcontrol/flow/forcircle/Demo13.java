package com.testing.flowcontrol.flow.forcircle;

public class Demo13 {
    public static void main(String[] args) {
        for (int i = 0; i < 10;) {
            System.out.println("死循环 " + i);
        }
    }
}
