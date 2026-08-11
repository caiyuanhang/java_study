package com.testing.oop2.Interface;

public class Demo04Test {
    public static void main(String[] args) {
        USB4.fnStatic();
        DevUtil.fnStatic();
    }
}

interface USB4 {
    public static void fnStatic() {
        System.out.println("接口中的静态方法 fnStatic");
    }
}

class DevUtil implements USB4 {
    // @Override  // 这里如果用上 @Override 会报错
    public static void fnStatic() {
        System.out.println("实现类中的 fnStatic 静态方法");
    }
}