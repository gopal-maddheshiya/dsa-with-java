package com.gopal.basics;

public class Product {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 13;
        int b = 5;
        int prod = multiply(a, b);
        System.out.println("a * b: " + prod);
    }
}
