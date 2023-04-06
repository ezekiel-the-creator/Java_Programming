package oop_java.Interface;

public class Circle implements Language, Shape {
    private double radius;


    @Override
    public void getSides(){
        System.out.println("I am a circle, I don't have any sides, but I don't mind cause I'm still cool");
    }
    public void getName(String name) {
        System.out.println("Type of language: " + name);
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}