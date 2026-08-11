package com.testing.oop2.Polymorphic.DemoTest07;

public class Mouse implements USB {
    public void open() {
        System.out.println("开启鼠标");
    }

    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click() {
        System.out.println("点击鼠标");
    }
}
