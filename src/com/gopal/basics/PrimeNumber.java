package com.gopal.basics;

public class PrimeNumber {
//    public static void isPrime(int n) {
//        if (n <= 1) {
//            System.out.println("Is not a Prime number");
//            return;
//        }
//        for (int i = 2; i <= n - 1; i++) {
//            if (n % i == 0) {
//                System.out.println("Is not a Prime number");
//                return;
//            }
//        }
//        System.out.println("Is a Prime number");
//    }


    // In Boolean Context.
//    public static boolean isPrime(int n) {
//        for (int i = 2; i <= n - 1; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//
//        }
//        return true;
//    }

    // Optimized version.
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 100;
//        System.out.println(isPrime(n) ? "Prime" : "Not Prime");
        primesInRange(n);
    }
}
