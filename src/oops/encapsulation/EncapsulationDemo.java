package com.gopal.oops.encapsulation;

public class EncapsulationDemo {
    private int value; // Data Hiding

    public void setValue(int value) {
        this.value = value; // Set Value
    }

    public int getValue() {
        return value; // Data Get
    }

    public static void main(String[] args) {
        EncapsulationDemo demo = new EncapsulationDemo();
        demo.setValue(100);  // Setting Data
        System.out.println(demo.getValue()); // Getting Data
    }
}
