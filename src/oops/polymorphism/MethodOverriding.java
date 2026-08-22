package oops.polymorphism;

class Animal {
    void move() {
        System.out.println("Animal is moving.");
    }

    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    @Override
    void move() {
        System.out.println("Dog is running.");
    }

    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.move();
        animal.eat();

        if (animal instanceof Dog dog) {
            dog.bark();
        }
    }
}
