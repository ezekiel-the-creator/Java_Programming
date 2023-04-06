package oop_java.abstraction;

public abstract class Animal {
    abstract void makeSound();

    public void eat() {
        System.out.println("I can eat.");
    }
}

class Dog extends Animal {
    //implementation of te abstract method
    public void makeSound() {
        System.out.println("woof woof");
    }
}

class Main {
    public static void main(String... args){
        Dog delta = new Dog();
        delta.makeSound();
        delta.eat();
    }
}
