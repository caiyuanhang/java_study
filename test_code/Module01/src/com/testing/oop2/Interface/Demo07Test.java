package com.testing.oop2.Interface;

public class Demo07Test {
}

interface InterfaceA1 {
    public default void fn() {
    }
}

interface InterfaceB1 {
    public default void fn() {
    }
}

class ImplCls02 implements InterfaceA1, InterfaceB1 {
    @Override
    public void fn() {
    }
}
