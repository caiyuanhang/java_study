package com.testing.oop.Demo09;

public class Demo09 {
    static void main() {
        Student.classRoom = "高三冲刺班";

        Student s1 = new Student("小韩", 200);
        System.out.println("第 1 个学生的名字：" + s1.name + "，年龄：" + s1.age + "，班级：" + Student.classRoom);

        Student s2 = new Student("大韩", 350);
        System.out.println("第 2 个学生的名字：" + s2.name + "，年龄：" + s2.age + "，班级：" + Student.classRoom);
    }
}
