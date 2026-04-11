package com.gopal.array;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 4, 5, 6}, {7, 8, 9, 10}};

        // Traversal of 2D Array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
