package com.testing.oop2.Interface;

public class Demo05Test {
    public static void main(String[] args) {
        System.out.println("NUM_1==" + USB05.NUM_1);
        System.out.println("NUM_2==" + USB05.NUM_2);
    }
}

interface USB05 {
    static final Number NUM_1 = 100;
    Number NUM_2 = 200;
    // Number NUM_3; // 会报错：字段 'NUM_3' 可能尚未初始化
}