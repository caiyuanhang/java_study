package com.testing.oop2.Extends.Demo02ExtendsFeature;

public class Demo02ExtendsFeatureTest01 {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println("parent-parentNum==" + p.parentNum);
        System.out.println("parent-normalNum==" + p.normalNum);

        System.out.println("------------------------");

        Children c = new Children();
        System.out.println("child-parentNum==" + c.parentNum); // Children 类没有 parentNum，就会从继承的父类上读取 parentNum;
        System.out.println("child-childNum==" + c.childNum);
        System.out.println("child-normalNum==" + c.normalNum); // Children 和 Parent 相同的属性，子类属性会覆盖父类属性

        System.out.println("------------------------");

        // 这里的 normalNum 拿到的是 Parent 这个类里面的，也就是子类继承父类，对于相同的成员变量，左边的类是哪个，该相同成员变量就取这个类里面对应的变量值
        Parent p1 = new Children();
        System.out.println("p1-normalNum==" + p1.normalNum);
    }
}
