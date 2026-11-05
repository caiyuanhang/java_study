package com.testing.chapter10.finalKeyword.DemoTest04;

public class DemoTest04 {
    public static void main(String[] args) {
        final Person p1 = new Person();
        // p1 = new Person(); // 报错：无法将值赋给 final 变量 'p1'
        System.out.println("修改 name 之前：" + p1.getName());
        p1.setName("李四");
        System.out.println("修改 name 之后：" + p1.getName());
    }
}
