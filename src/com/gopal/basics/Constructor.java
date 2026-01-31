package com.gopal.basics;

public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Gopal";
        s1.rollNo = 35;
        s1.pass = "xyz";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // copy
        s2.pass = "abcd";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollNo;
    String pass;
    int marks[];

    // Shallow copy constructor
//    Student(Student s1) {
//        marks = new int[3];
//        this.name = s1.name;
//        this.rollNo = s1.rollNo;
//        this.marks = s1.marks;
//    }

    // Deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // Non - parametrized Constructor
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called....");
    }

    // Parametrized Constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int rollNo) {
        marks = new int[3];
        this.rollNo = rollNo;
    }
}

