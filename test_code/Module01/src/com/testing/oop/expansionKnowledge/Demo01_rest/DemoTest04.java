package com.testing.oop.expansionKnowledge.Demo01_rest;

public class DemoTest04 {
    static void main() {
        String s = composedStr("马大哈", "嘿嘿");
        System.out.println("s==" + s);
    }

    public static String composedStr(String... rest) {
        if (rest.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (String s : rest) {
            result.append(s);
        }
        return result.toString();
    }
}
