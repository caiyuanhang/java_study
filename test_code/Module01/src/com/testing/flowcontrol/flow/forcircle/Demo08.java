package com.testing.flowcontrol.flow.forcircle;

public class Demo08 {
    public static void main(String[] args) {
        int count = 0, i = 1;
        while (i <= 100) {
            if(i % 2 == 0){
                count++;
            }
            i++;
        }
        System.out.println("（while循环）1-100 的偶数个数为 == " + count);
    }
}
