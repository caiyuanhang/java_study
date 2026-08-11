package com.testing.oop2.Interface;

public class Demo01Test {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        m.open();
        m.close();
    }
}

interface Usb {
    public abstract void open();

    public abstract void close();
}

class Mouse implements Usb {
    @Override
    public void open() {
        System.out.println("插入鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }
}