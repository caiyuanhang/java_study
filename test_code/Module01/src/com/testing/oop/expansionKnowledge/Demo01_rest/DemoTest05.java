package com.testing.oop.expansionKnowledge.Demo01_rest;

public class DemoTest05 {
    static void main() {
        String s = composedStr("-", "老韩", "韩老魔", "小韩");
        System.out.println("s==" + s);
    }

    public static String composedStr(String splitStr, String... rest) {
        if (rest.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rest.length; i++) {
            sb.append(rest[i]);
            if(i < rest.length - 1) {
                sb.append(splitStr);
            }
        }
        return  sb.toString();
    }
}
