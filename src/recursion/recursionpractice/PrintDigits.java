package com.gopal.recursion.recursionpractice;

public class PrintDigits {
    public static void printDigits(int number) {
        String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigits(number / 10);

        System.out.println(digits[lastDigit]);
    }

    public static void main(String[] args) {
        int number = 1947;
        printDigits(number);
    }
}
