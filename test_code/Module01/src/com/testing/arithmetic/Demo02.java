package com.testing.arithmetic;

public class Demo02 {
    public static void main(String[] args) {
        int num = 10;
        num++;
        System.out.println("num++ == " + num);

        ++num;
        System.out.println("++num == " + num);

        num--;
        System.out.println("num-- == " + num);

        --num;
        System.out.println("--num == " + num);
    }
}
/*
* num++ ==11
  ++num ==12
  num-- ==11
  --num ==10
* */