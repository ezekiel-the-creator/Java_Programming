package oop_java.abstraction;

public class Main extends Language{
    public static void main(String... args){
        Main obj = new Main();
        Dog delta = new Dog();
        MountainBike m1 = new MountainBike();
        SportsBike s1 = new SportsBike();

        obj.display();
        delta.makeSound();
        delta.eat();
        s1.brake();
        m1.brake();
    }
}