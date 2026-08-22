package com.gopal.basics;

public class Palindrome {
    public static boolean checkPalindrome(int n) {
        int reverse = 0;
        int temp = Math.abs(n);
        int original = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        if (reverse == original) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(121));
        System.out.println(checkPalindrome(123));
    }
}
