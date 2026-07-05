package com.testing.oop.Demo08;

public class Demo08 {
    static void main() {
        Student s1 = new Student();
        System.out.println("s1--name：" + s1.getName() + "，age：" + s1.getAge());

        Student s2 = new Student();
        s2.setName("韩立");
        System.out.println("s2--name：" + s2.getName() + "，age：" + s2.getAge());

        Student s3 = new Student(280);
        s3.setAge(280);
        System.out.println("s3--name：" + s3.getName() + "，age：" + s3.getAge());

        Student s4 = new Student();
        s4.setName("韩道友");
        s4.setAge(280);
        System.out.println("s4--name：" + s4.getName() + "，age：" + s4.getAge());
    }
}
