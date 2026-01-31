package com.gopal.basics;

public class EvenNumber {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        int a = 10;
        if (isEven(a)) {
            System.out.println(a + " is even");
        } else {
            System.out.println(a + " is odd");
        }
    }
}
