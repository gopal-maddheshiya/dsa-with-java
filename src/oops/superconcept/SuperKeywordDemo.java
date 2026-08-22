package com.gopal.oops.superconcept;

public class SuperKeywordDemo {
    public static void main(String args[]) {
        Horse myHorse = new Horse();
        System.out.println(myHorse.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "brown";
//        super();
        System.out.println("Horse constructor is called");
    }
}