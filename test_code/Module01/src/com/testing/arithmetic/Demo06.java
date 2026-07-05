package com.testing.arithmetic;

public class Demo06 {
    public static void main(String[] args) {
        byte b = 10;
        // b = b + 1; // 这里会报错，是因为 byte 在运算的时候，会被 jvm 自动转成 int，所以这里需要我们将 b + 1 的结果进行强转。
        b = (byte)(b + 1); // 此时就没有报错了
        System.out.println("b = " + b);
        
        short s = 5;
        s+=1; // s+=1 没有问题，就是因为上面的过程在 jvm 里面自动处理了
        System.out.println("s = " + s);
    }
}
