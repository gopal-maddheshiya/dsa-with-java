package com.gopal.recursion;

public class RecursionBasics {
    // Print number from n to 1 (decreasing order).
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // Print number from 1 to n (ascending order).
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // Find factorial of n.
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * factorial(n - 1);
        return fn;
    }

    // Sum of first n natural numbers.
    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = calcSum(n - 1);
        int Sn = n + calcSum(n - 1);
        return Sn;
    }

    // Calculate the nth term in Fibonacci
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // Check if array is sorted or not.
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // Write a function to find the first occurrence of an element in an array.
    public static int firstOcurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcurrence(arr, key, i + 1);
    }

    // Write a function to find the last occurrence of an element in an array.
    public static int lastOcurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcurrence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // Print x to the power n
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        //int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
//        printDec(n);
//        printInc(n);
//        System.out.println(factorial(5));
//        System.out.println(calcSum(5));
//        System.out.println(fib(n));
        int arr[] = {1, 3, 5, 6, 7, 5, 8};
//        System.out.println(isSorted(arr, 0));
        int key = 5;
//        System.out.println(firstOcurrence(arr, key, 0));
//        System.out.println(lastOcurrence(arr, key, 0));
        System.out.println(power(2, 10));
    }
}




