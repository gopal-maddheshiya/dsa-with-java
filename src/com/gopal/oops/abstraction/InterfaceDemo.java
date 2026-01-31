package com.gopal.oops.abstraction;

public class InterfaceDemo {
    public static void main(String[] args) {
//        Queen q = new Queen();
//        q.moves();
        Bear b = new Bear();
        b.eat();
    }
}

interface Carnivores {
    void eat();
}

interface Herbivores {
    void eat();
}

class Bear implements Carnivores, Herbivores {
    public void eat() {
        System.out.println("Eat both plants and meat");
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 direction)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (1 step only)");
    }
}