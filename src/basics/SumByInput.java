package com.gopal.basics;

import java.util.*;

public class SumByInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your first number : ");
        int input1 = sc.nextInt();
        System.out.print("Please enter your second number : ");
        int input2 = sc.nextInt();
        System.out.print("The sum of " + input1 + " and " + input2 + " is : " + (input1 + input2));
    }
}
