//Question 2: In a program, input the side of a square. You have to output the area of the square.

package com.gopal.assignments._01_assignment;

import java.util.Scanner;

public class _02_AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square : ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of square = " + area);
    }
}
