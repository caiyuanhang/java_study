package com.testing.oop.expansionKnowledge.Demo03_algorithm;

public class Demo03AlgorithmTest03 {
    static void main() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int idx = twoFind(nums, 4);
        System.out.println("4的索引是==" + idx);
    }

    public static int twoFind(int[] arr, int key) {
        int min = 0, max = arr.length - 1, mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            if (key < arr[mid]) {
                max = mid - 1;
            } else if (key > arr[mid]) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
