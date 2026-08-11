package com.testing.oop2.Interface;

public class Demo03Test {
    public static void main(String[] args) {
        Mouse03 m3 = new Mouse03();
        m3.fnDef();

        Keyboard03 k3 = new Keyboard03();
        k3.fnDef();
    }
}

interface Use {
    public default void fnDef() {
        System.out.println("我是 Use 接口中的默认方法");
    }
}

class Mouse03 implements Use {
}

class Keyboard03 implements Use {
    @Override
    public void fnDef() {
        System.out.println("我是重写了 Use 接口中 fnDef 的方法");
    }
}
