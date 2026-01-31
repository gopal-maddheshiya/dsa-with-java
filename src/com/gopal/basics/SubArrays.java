package com.gopal.basics;

public class SubArrays {
    public static void printSubArrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {

                    sum += numbers[k];
                    System.out.print(numbers[k] + " ");


                }
                System.out.print(", Sum is = " + sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total subarrays is: " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }
}
