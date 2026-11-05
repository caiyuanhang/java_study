package com.testing.chapter10.innerClass.TestDemo07;

public class Person {
    public void fn() {
        class Heart {
            public void heartbeat() {
                System.out.println("心跳声");
            }
        }

        new Heart().heartbeat();
    }
}
