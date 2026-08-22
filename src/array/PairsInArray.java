package com.gopal.array;

public class PairsInArray {
    public static void pairs(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + nums[i] + ", " + nums[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        pairs(arr);
    }
}
