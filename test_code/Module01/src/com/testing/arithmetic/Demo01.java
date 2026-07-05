package com.testing.arithmetic;

public class Demo01 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 3;
        int addition = num1 + num2;
        System.out.println("算术运算符-加法=="+addition);

        int sub = num1 - num2;
        System.out.println("算术运算符-减法=="+sub);

        int mul = num1 * num2;
        System.out.println("算术运算符-乘法=="+mul);

        int div = num1 / num2;
        System.out.println("算术运算符-除法=="+div);

        int mod = num1 % num2;
        System.out.println("算术运算符-模=="+mod);

        // 注意：当 + 的左右某一侧有字符串时，它的作用就变成了拼接
        String str = num1 + "1";
        System.out.println("关于 + 的拼接功能=="+str);
    }

}

/*
*   算术运算符-加法==13
    算术运算符-减法==7
    算术运算符-乘法==30
    算术运算符-除法==3
    算术运算符-模==1
    关于 + 的拼接功能==101
* */