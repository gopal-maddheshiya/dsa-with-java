package com.gopal.recursion;

public class TillingProblem {
    // Tilling Problem
    public static int tillingProblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
//        // Work
//        // Vertical Choice
//        int fnm1 = tillingProblem(n - 1);
//
//        // Horizontal Choice
//        int fnm2 = tillingProblem(n - 2);
//
//        int totWays = fnm1 + fnm2;
//        return totWays;

        // In short
        return tillingProblem(n - 1) + tillingProblem(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(tillingProblem(4));
    }
}
