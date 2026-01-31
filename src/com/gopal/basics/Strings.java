package com.gopal.basics;

public class Strings {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static String subString(String str, int si, int ei) {
        String substrings = "";
        for (int i = si; i < ei; i++) {
            substrings += str.charAt(i);
        }
        return substrings;
    }

    public static void main(String[] args) {
        // String Declaration
//        char arr[] = {'a', 'b', 'c', 'd'};
//        String str = "abcd";
//        String str2 = new String("xyz");

//        Strings are IMMUTABLE

//        Scanner sc = new Scanner(System.in);
//        String name;
//        name = sc.nextLine();
//        System.out.println("Length of the string is: " + name.length());
//        String firstName = "Gopal";
//        String lastName = "Maddheshiya";
//        String fullName = firstName + " " + lastName;
//        printLetters(fullName);

        // String Function - Compare.

//        String s1 = "Tony";
//        String s2 = "Tony";
//        String s3 = new String("Tony");
//
//        if (s1 == s2) {
//            System.out.println("Strings are equal");
//        } else {
//            System.out.println("Strings are not equal");
//        }
//
//        if (s1 == s3) {
//            System.out.println("Strings are equal");
//        } else {
//            System.out.println("Strings are not equal");
//        }
//
//        // equals()
//        if (s1.equals(s3)) {
//            System.out.println("Strings are equal");
//        } else {
//            System.out.println("Strings are not equal");
//        }

        // String function - substring

//        String substr = "HelloWorld";
//        int si = 2;
//        int ei = 5;
//        System.out.println(subString(substr, si, ei));

        // Print largest string

//        String fruits[] = {"apple", "mango", "banana"};
//        String largest = fruits[0];
//        for (int i = 0; i < fruits.length; i++) {
//            if (largest.compareTo(fruits[i]) < 0) {
//                largest = fruits[i];
//            }
//        }
//        System.out.println(largest);

        // StringBuilder

//        StringBuilder sb = new StringBuilder("");
//        for (char ch = 'a'; ch <= 'z'; ch++) {
//            sb.append(ch);
//        }
//        // Time complexity is O(26)
//        System.out.println(sb.length());

        System.out.println(~6);
    }
}
