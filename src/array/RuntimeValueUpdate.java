package com.gopal.array;

public class RuntimeValueUpdate {
    public static void main(String[] args) {
        int row = 2;
        int col = 3;

        int value = 1;

        int[][] arr = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value;
                value++;
            }
        }
        // Printing the 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}