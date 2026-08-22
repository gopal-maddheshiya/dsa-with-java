package com.gopal.basics;

public class Functions {
    public static void greetings(int x, int y) { // parameters or formal parameters
        System.out.println("Hello World!");
        System.out.println("Welcome to the world of JAVA");
        int sum = x + y;
        System.out.print("The sum is: " + sum);
    }

    public static void main(String[] args) {
//        greetings();
        int a = 65;
        int b = 34;
        greetings(a, b); // arguments or actual parameters
    }
}
