package com.testing.chapter10.innerClass.TestDemo06;

public class TestDemo06 {
    public static void main(String[] args) {
        Student.Heart studentHeart = new Student().new Heart();
        studentHeart.fn("动漫");
    }
}
