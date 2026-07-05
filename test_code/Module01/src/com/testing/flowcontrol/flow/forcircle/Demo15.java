package com.testing.flowcontrol.flow.forcircle;

public class Demo15 {
    public static void main(String[] args) {
        for (int min = 0; min < 60; min++) {
            for (int sec = 0; sec < 60; sec++) {
                System.out.println(min + "分" + sec + "秒");
            }
        }
    }
}
