package com.gopal.basics;

public class LargestInArray {
    public static int largestNumber(int numbers[]) {
        int largNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largNum) {
                largNum = numbers[i];
            }
        }
        return largNum;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("The large number in array is: " + largestNumber(numbers));
    }
}
