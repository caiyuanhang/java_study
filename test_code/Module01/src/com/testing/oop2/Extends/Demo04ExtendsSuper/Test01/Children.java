package com.testing.oop2.Extends.Demo04ExtendsSuper.Test01;

public class Children extends Parent {
    public Children() {
        // 在代码块的第一行，jvm 默认调用了 super() 方法
        System.out.println("Children 类的无参构造");
    }

    public Children(int num) {
        super(num);
        System.out.println("Children 类的有参构造" + num);
    }
}
