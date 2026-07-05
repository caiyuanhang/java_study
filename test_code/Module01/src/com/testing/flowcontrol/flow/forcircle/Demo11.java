package com.testing.flowcontrol.flow.forcircle;

public class Demo11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
    }
}
