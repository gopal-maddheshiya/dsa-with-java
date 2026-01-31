package com.gopal.sorting;

public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // Comparision
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;  // update start
            } else {
                end = mid - 1; // update end
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {13, 53, 64, 75, 78, 93};
        int key = 93;
        System.out.println("The index of " + key + " is " + binarySearch(numbers, key));
    }
}
