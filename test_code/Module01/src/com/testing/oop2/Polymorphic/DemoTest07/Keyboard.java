package com.testing.oop2.Polymorphic.DemoTest07;

public class Keyboard implements USB {
    public void open() {
        System.out.println("开启键盘");
    }

    public void close() {
        System.out.println("关闭键盘");
    }

    public void keydown() {
        System.out.println("按下键盘");
    }
}
