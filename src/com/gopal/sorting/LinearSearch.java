package com.gopal.sorting;

public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 5, 7, 9, 12, 15};
        int key = 12;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("The value at index: " + index);
        }
    }
}
