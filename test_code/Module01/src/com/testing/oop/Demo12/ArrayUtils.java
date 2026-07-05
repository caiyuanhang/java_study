package com.testing.oop.Demo12;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static int getMax(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
