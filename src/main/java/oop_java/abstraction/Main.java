package oop_java.abstraction;

public class Main extends Language{
    public static void main(String... args){
        Main obj = new Main();
        Dog delta = new Dog();

        obj.display();
        delta.makeSound();
        delta.eat();
    }
}