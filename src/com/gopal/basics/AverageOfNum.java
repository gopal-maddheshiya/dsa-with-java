package com.gopal.basics;

public class AverageOfNum {
    public static int avgOfNum(int a, int b, int c) {
        int sum = (a + b + c) / 3;
        return sum;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 4;
        System.out.println("The average of the numbers is: " + avgOfNum(a, b, c));
    }
}
