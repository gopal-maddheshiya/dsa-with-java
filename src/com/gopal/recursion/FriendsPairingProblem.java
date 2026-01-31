package com.gopal.recursion;

public class FriendsPairingProblem {
    public static int friendsPairing(int n) {
        // Base Case
        if (n == 1 || n == 2) {
            return n;
        }
//        // Choice
//        // Single choice
//        int fnm1 = friendsPairing(n - 1);
//
//        // Pairing Choice
//        int fnm2 = friendsPairing(n - 2);
//        int pairWays = (n - 1) * fnm2;
//
//        // Total Ways
//        int totWays = fnm1 + pairWays;
//        return totWays;

        // In short
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendsPairing(n));
    }
}
