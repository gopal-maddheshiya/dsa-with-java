package com.gopal.basics;

public class ArraysFunctionArgs {
    public static void updateMarks(int marks[], int nonChangble) {
        nonChangble = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int nonChangble = 5;
        int marks[] = {97, 98, 99};
        updateMarks(marks, nonChangble);
        System.out.println(nonChangble);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}
