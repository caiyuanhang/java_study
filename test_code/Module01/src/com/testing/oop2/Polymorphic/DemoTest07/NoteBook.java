package com.testing.oop2.Polymorphic.DemoTest07;

public class NoteBook {
    public void start() {
        System.out.println("笔记本-开机！");
    }

    public void stop() {
        System.out.println("笔记本-关机！");
    }

    public void useUSB(USB usb) {
        usb.open();
        if (usb instanceof Mouse d1) {
            d1.click();
        } else if (usb instanceof Keyboard d2) {
            d2.keydown();
        }
        usb.close();
    }
}
