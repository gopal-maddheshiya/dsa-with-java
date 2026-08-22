package com.gopal.oops.polymorphism;

class Product {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;

// Two methods have the same name but different number of parameters.
// Compiler selects the correct method based on how many arguments are passed.

    }
}

class ProductOfDouble {

    public int prod(int a, int b, int c) {
        return a * b * c;

    }

    public double prod(double a, double b, double c) {
        return a * b * c;

// Methods differ in parameter types (int vs double).
// Compiler matches the method based on the exact data type of arguments.

    }
}

class Student {
    public void studentId(String name, int rollNo) {
        System.out.println("Name: " + name + ", " + "Roll Number: " + rollNo);
    }

    public void studentId(int rollNo, String name) {
        System.out.println("Roll Number: " + rollNo + ", Name: " + name);

// Methods have the same name but parameter order is different.
// Compiler identifies which method to call based on sequence of arguments.

    }
}

// Convert to a higher type in the same hierarchy (e.g., byte -> int).
// Convert to the next higher hierarchy if needed (e.g., int -> float).

class Demo {

    public void show(int x) {
        System.out.println("In int: " + x);
    }

    public void show(String s) {
        System.out.println("In String: " + s);
    }

    public void show(byte b) {
        System.out.println("In byte: " + b);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Product obj1 = new Product();

        int prod1 = obj1.multiply(5, 6);
        System.out.println("Product of two integers: " + prod1);

        int prod2 = obj1.multiply(5, 6, 4);
        System.out.println("Product of three integers: " + prod2);


        ProductOfDouble obj2 = new ProductOfDouble();

        int prod3 = obj2.prod(3, 5, 6);
        System.out.println("Product of two integers: " + prod3);

        double prod4 = obj2.prod(3.4, 6.2, 3.5);
        System.out.println("Product of three double: " + prod4);


        Student s = new Student();
        s.studentId("Gopal", 35);
        s.studentId(29, "Shrijaya");


        Demo obj = new Demo();

        obj.show((byte) 25);
        obj.show("hello");
        obj.show(250);
        obj.show('A');
        // obj.show(7.5);    Error: no suitable method for double
    }
}