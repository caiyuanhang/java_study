package com.testing.oop.expansionKnowledge.Demo02_recursion;

public class Demo02RecursionTest04 {
    static void main() {
        int res = getNum(12);
        System.out.println("res==" + res);
    }

    public static int getNum(int mounth) {
        if (mounth <= 2) {
            return  1;
        }

        return  getNum(mounth - 1) + getNum(mounth - 2);
    }
}
