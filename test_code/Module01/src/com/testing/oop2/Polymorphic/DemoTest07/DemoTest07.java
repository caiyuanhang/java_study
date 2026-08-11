package com.testing.oop2.Polymorphic.DemoTest07;

public class DemoTest07 {
    public static void main(String[] args) {
        NoteBook nb = new NoteBook();
        Mouse m = new Mouse();
        nb.start();
        nb.useUSB(m);
        nb.stop();

        System.out.println("--------------");

        Keyboard k = new Keyboard();
        nb.start();
        nb.useUSB(k);
        nb.stop();
    }
}
