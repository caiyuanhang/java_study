package com.testing.arithmetic;

public class Demo08 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 10;

        boolean res1 = (n1>n2) && (n1==n3);
        boolean res2 = (n1>n2) || (n1==n3);
        boolean res3 = !(n1<n2);
        boolean res4 = (n1>n2) ^ (n1!=n3);

        System.out.println("&& -> " + res1); // false
        System.out.println("||-> " + res2); // true
        System.out.println("! -> " + res3); // false
        System.out.println("^ -> " + res4); // false
    }
}
