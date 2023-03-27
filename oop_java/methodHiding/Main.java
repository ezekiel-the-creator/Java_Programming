public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();  //The animal makes a sound.

        Dog dog = new Dog();
        dog.makeSound();     //The dog barks.

        Animal anotherDog = new Dog();
        anotherDog.makeSound();// The animal makes a sound.
    }
}