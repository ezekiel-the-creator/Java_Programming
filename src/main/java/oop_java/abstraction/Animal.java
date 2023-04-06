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
        System.out.println("Bark bark");
    }
}

//if the subclass doesn't provide the implemantation of the abstract methdod declared in the super class, then it should also be declared an abstract class.
//if an abstract class have a constructor it can be accessed in the child class using super keyword.
