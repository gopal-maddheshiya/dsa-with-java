package com.gopal.oops.polymorphism;

public class RunTime {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

// Method overriding
class Animal {
    void eat() {
        System.out.println("eats anything.");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass.");
    }
}