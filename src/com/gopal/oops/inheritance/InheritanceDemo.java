package com.gopal.oops.inheritance;

public class InheritanceDemo {
    public static void main(String args[]) {
//        Fish shark = new Fish();
//        shark.eat();
//        Dog doggy = new Dog();
//        doggy.eat();
//        doggy.breath();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

class Mammals extends Animal {
    int legs;
}

class Fish extends Mammals {
    void swim() {
        System.out.println("swimming");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flying");
    }
}

// Multi level inheritance
//class Dog extends Animal {
//    String breed;
//}
// Derived class/ Subclass
//class Fish extends Animal {
//    int fins;
//
//    void swim() {
//        System.out.println("Swims in water");
//    }
//}
