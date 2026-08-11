package com.testing.oop2.Interface;

public class Demo02Test {
    public static void main(String[] args) {
        Keyboard k = new Keyboard();
        String open = k.open();
        System.out.println(open);
        String close = k.close();
        System.out.println(close);
    }
}

interface Usb2 {
    public abstract String open();

    String close();
}

class Keyboard implements Usb2 {
    @Override
    public String open() {
        return "键盘接入成功！";
    }

    @Override
    public String close(){
        return "键盘成功拔掉！";
    }
}
