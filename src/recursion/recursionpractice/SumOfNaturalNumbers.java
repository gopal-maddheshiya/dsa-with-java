package recursion.recursionpractice;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int sum(int n) {
        // base case
        if (n == 1)
            return 1;

        return n + (sum(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
