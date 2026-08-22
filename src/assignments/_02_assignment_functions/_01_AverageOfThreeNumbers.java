//Question 1: Write a Java method to compute the average of three numbers.

package com.gopal.assignments._02_assignment_functions;

public class _01_AverageOfThreeNumbers {
    public static double average(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

    public static void main(String[] args) {
        int a = 15, b = 25, c = 45;
        System.out.println(average(a, b, c));
    }
}
