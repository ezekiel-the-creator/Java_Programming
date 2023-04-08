package oop_java.Encapsulation;

public class Main {
    public static void main(String... args){
        Person person = new Person();
        Rectangle rectangle = new Rectangle(0, 0);
        rectangle.length = 6;
        rectangle.width = 2;
        rectangle.getArea();
        person.setAge(30);
        person.setName("John");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
} 
