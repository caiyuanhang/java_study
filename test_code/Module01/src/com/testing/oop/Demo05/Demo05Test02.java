package com.testing.oop.Demo05;

public class Demo05Test02 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44};
        String res = customToString(arr);
        System.out.println(res);
    }

    // 封装自定义 toString 功能
    public static String customToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(arr[i]);
        }
        sb.append("]");

        return sb.toString();
    }
}
