package com.testing.oop2.Extends.Demo01ExtendsUse;

public class Demo01ExtendsUseTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "老师1";
        t.age = 22;
        // t.eat(); // 父类的私有成员无法使用，会报错：'eat()' 在 'com.testing.oop2.Extends.Demo01ExtendsUse.Employee' 中具有 private 访问权限
        t.work();

        Manager m = new Manager();
        m.name = "管理者1";
        m.age = 22;
        m.work();
    }
}
