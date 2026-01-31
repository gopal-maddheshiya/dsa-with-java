package com.gopal.oops.staticconcept;

public class StaticKeywordDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "J.P. Public School";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC"; // Changed school name
    }
}

class Student {
    static int returnPercentage(int maths, int phy, int chem) {
        return (maths + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}