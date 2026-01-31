package com.gopal.basics;

import java.util.*;

public class ArieaOfCricle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextInt();
        double area = Math.PI * radius * radius;
        System.out.printf("The area of the circle is: %.2f" + area);
    }
}
