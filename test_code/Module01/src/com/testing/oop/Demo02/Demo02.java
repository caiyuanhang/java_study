package com.testing.oop.Demo02;

public class Demo02 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "HUAWEI";
        phone.color = "黑色";
        phone.price = 5220;

        phone.call("王思聪");
        String sms = phone.message("柳岩");
        System.out.println(sms);
    }
}
