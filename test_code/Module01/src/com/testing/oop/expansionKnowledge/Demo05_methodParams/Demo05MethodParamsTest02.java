package com.testing.oop.expansionKnowledge.Demo05_methodParams;

public class Demo05MethodParamsTest02 {
    static void main() {
        int[] nums = {11, 22, 33};
        method(nums);
        System.out.println("outer==nums[0]: " + nums[0] + ", nums[1]: " + nums[1] + ", nums[2]: " + nums[2]);
    }

    public static void method(int[] args) {
        args[0] = 1111;
        args[1] = 1111;
        args[2] = 1111;
        System.out.println("inner==nums[0]: " + args[0] + ", nums[1]: " + args[1] + ", nums[2]: " + args[2]);
    }
}
