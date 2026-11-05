package com.testing.chapter10.accessModifiers;

public class DemoTest01 {
    public static void main(String[] args) {
        SameCls sCls = new SameCls();
        System.out.println(sCls.name1);
        System.out.println(sCls.name2);
        System.out.println(sCls.name3);
        // 'name4' 在 'com.testing.chapter10.accessModifiers.SameCls' 中具有 private 访问权限
        //  System.out.println(sCls.name4);
    }
}
