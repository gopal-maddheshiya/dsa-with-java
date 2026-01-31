package com.gopal.oops.abstraction;

public class AbstractClassDemo {
    public static void main(String[] args) {
//        Horse h = new Horse();
//        h.eat();
//        h.walk();
//        System.out.println(h.color);
//        Chicken c = new Chicken();
//        c.eat();
//        c.walk();
        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustan
    }
}

abstract class Animal {
    String color;

    Animal() {
//        color = "brown";
        System.out.println("Animal constructor called");
    }

    // Non-abstract class
    void eat() {
        System.out.println("animal eats");
    }

    // Abstract class
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void changColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
