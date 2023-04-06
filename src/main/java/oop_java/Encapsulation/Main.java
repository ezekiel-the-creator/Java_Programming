package oop_java.Encapsulation;

public class Main {
    public static void main(String... args){
        Person person = new Person();
        Area rectangle = new Area(0, 0);
        rectangle.length = 6;
        rectangle.width = 2;
        person.setName("John");
        person.setAge(30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
} 
