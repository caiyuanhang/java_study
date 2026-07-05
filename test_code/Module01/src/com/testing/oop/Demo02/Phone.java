package com.testing.oop.Demo02;

public class Phone {
    String brand;
    String color;
    int price;

    public void call(String name) {
        String callStr1 = "价格为" + price + "的" + color + brand;
        String callStr2 = "给" + name + "打电话";
        System.out.println(callStr1 + callStr2);
    }

    public String message(String name) {
        return "给" + name + "发短信";
    }
}
