public class Main {
    public static void main(String... args){

        Animal animal = new Animal();
        animal.makeSound();

        Lion lion = new Lion();
        lion.makeSound();//The method in the subclass Lion gets implemented here.
    }
}

//A private methods can neither be inherited or overriden.
