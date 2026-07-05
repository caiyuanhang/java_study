package com.testing.oop.expansionKnowledge.Demo06_commandLineParams;

public class Demo06CommandLineParamsTest02 {
    static void main(String... rest) {
        for (int i = 0; i < rest.length; i++) {
            System.out.println("idea 命令行参数" + i + 1 + ": " + rest[i]);
        }
    }
}
