//Question 4: What will be the type of the result in the following Java code?

package com.gopal.assignments._01_assignment_basics;

public class _04_TypePromotion {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i % c) - (d * s);
        System.out.println("The type of result will be double and it should be declare as double result = (f * b) + (i % c) - (d * s)");
    }
}

