package com.testing.array;

public class Demo23 {
    public static void main(String[] args) {
        String[][] arr = {{"AA", "BB"}, {"CC"}};
        String targetItem = arr[0][1];
        System.out.println("取二维数组中的第一个一维数组，并拿到它的第二个元素==" + targetItem);
    }
}
