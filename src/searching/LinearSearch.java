package com.gopal.searching;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
}
