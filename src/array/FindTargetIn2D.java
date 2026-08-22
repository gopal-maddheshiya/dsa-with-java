package com.gopal.array;

import java.util.Scanner;

public class FindTargetIn2D {

    public static int[] targetIndex(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        int[] result = targetIndex(arr, target);

        if (result[0] == -1) {
            System.out.print("Not Found");
        } else {
            System.out.print("Found at index: " + result[0] + ", " + result[1]);
        }
        sc.close();
    }
}
