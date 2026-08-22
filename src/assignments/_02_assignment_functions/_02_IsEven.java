//Question 2: Write a method named isEven that accepts an int argument.
// The method should return true if the argument is even, or false otherwise.
// Also, write a program to test your method.

package com.gopal.assignments._02_assignment_functions;

public class _02_IsEven {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 9;
        if (isEven(n)) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }
}
