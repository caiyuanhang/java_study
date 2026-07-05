package com.testing.arithmetic;

public class Demo09 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        boolean res1 = (n1 > n2) & (++n1>n2);
        System.out.println("单与-&-判断 == " + res1 + " n1 == " + n1); // false，后面 ++n1 继续执行，n1 为 11

        boolean res2 = (n1 > n2) && (++n2>n1);
        System.out.println("双与-&&-判断 == " + res2 + " n2 == " + n2); // false，后面 ++n2 不会执行，n2 还是为 20

        boolean res3 = (n1 < n2) | (++n1>n2);
        System.out.println("单或-|-判断 == " + res3 + " n1 == " + n1); // true，后面 ++n1 继续执行，n1 为 12

        boolean res4 = (n1 < n2) || (++n2>n1);
        System.out.println("双或-||-判断 == " + res4 + " n2 == " + n2); // true，后面 ++n2 不会执行，n2 还是为 20
    }
}
