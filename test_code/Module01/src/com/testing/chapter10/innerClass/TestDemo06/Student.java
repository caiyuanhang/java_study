package com.testing.chapter10.innerClass.TestDemo06;

public class Student {
    String name = "学生 A";

    class Heart {
        String name = "Heart A";

        public void fn (String name){
            System.out.println("fn 方法的 name 参数：" + name);
            System.out.println("内部类 Heart 的 name 属性：" + this.name);
            System.out.println("外部类 Student 的 name 属性：" + Student.this.name);
        }
    }
}
