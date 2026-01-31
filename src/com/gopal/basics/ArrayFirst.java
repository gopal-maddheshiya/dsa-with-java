package com.gopal.basics;

import java.util.*;

public class ArrayFirst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating Arrays.
//        int marks[] = new int[50];
//        int numbers[] = {1, 3, 5};
//        int moreNumbers[] = {6, 7, 8};
//        String fruits[] = {"apple", "orange", "mango"};

        // Input/Output.
        System.out.println("Enter marks for Chemistry, Physics and Math (3 integers):");
        int marks[] = new int[100];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("chem: " + marks[0] + " phy: " + marks[1] + " math: " + marks[2]);
        marks[2] = marks[2] - 5;
        System.out.println("math: " + marks[2]);
        System.out.println("length of array: " + marks.length);
    }
}

