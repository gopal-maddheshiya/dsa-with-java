package com.gopal.oops.polymorphism;

public class CompileTime {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 6));
        System.out.println(calc.sum((float) 5, (float) 6));
        System.out.println(calc.sum(5, 6, 7));
    }

}

// Method Overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
