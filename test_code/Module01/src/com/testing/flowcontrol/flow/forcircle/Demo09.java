package com.testing.flowcontrol.flow.forcircle;

public class Demo09 {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            System.out.println("do while，i == " + i); // 相对于 for 循环，do while 只会打印 2 次，因为在一开始的时候就执行了一次 i++。
        } while (i < 3);
    }
}
