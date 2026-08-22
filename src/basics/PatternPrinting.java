package com.gopal.basics;

public class PatternPrinting {
    public static void rightAnglePattern(int a) {
        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void invertedRightAngleTringle(int a) {
        for (int i = a; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a = 5;
//        rightAnglePattern(a);
        invertedRightAngleTringle(a);
    }
}
