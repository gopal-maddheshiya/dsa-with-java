//Question 1: In a program, input three numbers: A, B, and C. You have to output the average of these three numbers.

package com.gopal.assignments._01_assignment_basics;

import java.util.Scanner;

public class _01_AverageOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double avg = (a + b + c) / 3.0;
        System.out.println("Average = " + avg);
    }
}
