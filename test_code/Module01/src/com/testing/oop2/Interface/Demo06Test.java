package com.testing.oop2.Interface;

public class Demo06Test {
}

interface InterfaceA {
    void fn();
}

interface InterfaceB {
   public abstract void fn();
}

class ImplCls implements InterfaceA, InterfaceB {
   @Override
   public void fn() {};
}