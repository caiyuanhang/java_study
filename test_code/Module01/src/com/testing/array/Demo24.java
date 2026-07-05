package com.testing.array;

import java.util.Arrays;

public class Demo24 {
    public static void main(String[] args) {
        String[][] arr = {{"AA", "BB"}, {"CC"}, {"DD", "EE", "FF"}};
        for(String[] it: arr) {
            System.out.println("当前的一维数组==" + Arrays.toString(it));
            for(int i = 0; i < it.length; i++){
                System.out.println("一维数组中下标为 " + i + " 的元素==" + it[i]);
            }
        }
    }
}
