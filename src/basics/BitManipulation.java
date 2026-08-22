package com.gopal.basics;

public class BitManipulation {
    public static void oddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // Even Number
            System.out.println("Even Number");
        } else {
            // Odd Number
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        oddEven(2);
        oddEven(5);
        oddEven(11);
    }
}
