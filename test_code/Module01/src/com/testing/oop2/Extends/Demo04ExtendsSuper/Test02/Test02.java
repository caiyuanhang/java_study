package com.testing.oop2.Extends.Demo04ExtendsSuper.Test02;

public class Test02 {
    public static void main(String[] args) {
        Children c1 = new Children();
        System.out.println("-----------------------");
        Children c2 = new Children(123);
        System.out.println("-----------------------");
        c2.fn();
    }
}
