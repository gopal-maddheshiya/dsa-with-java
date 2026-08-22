package com.gopal.questionspractice;

public class AssignName {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Gopal";
        s.marks = 97;
        System.out.println("Name is " + s.name);
        System.out.println("Marks is  " + s.marks);
    }
}

class Student {
    String name;
    int marks;
}
