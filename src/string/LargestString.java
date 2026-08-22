package com.gopal.string;

public class LargestString {
    public static String getLargestString(String[] fruits) {
        String largest = fruits[0];

        for (String fruit : fruits) {
            if (largest.compareTo(fruit) < 0) {
                largest = fruit;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "banana"};
        System.out.println(getLargestString(fruits));
    }
}
