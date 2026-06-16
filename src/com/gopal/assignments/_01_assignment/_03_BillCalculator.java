// Question 3: Enter the cost of three items from the user (using the float data type): a pencil, a pen, and an eraser.
// You have to output the total cost of the items back to the user as their bill.
// Add-on: You can also try adding 18% GST to the total bill as an advanced problem.

package com.gopal.assignments._01_assignment;

import java.util.Scanner;

public class _03_BillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Price of pencil : ");
        float pencil = sc.nextFloat();

        System.out.print("Price of pen : ");
        float pen = sc.nextFloat();

        System.out.print("Price of eraser : ");
        float eraser = sc.nextFloat();

        double bill = (pencil + pen + eraser) * 1.18;

        System.out.printf("Price of pencil %.2f, pen %.2f and eraser is %.2f\n", pencil, pen, eraser);
        System.out.printf("Your total bill are %.2f rupees including 18%% GST", bill);
    }
}
