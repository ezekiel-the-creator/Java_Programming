package oop_java.Interface;

public class Circle implements Language, Shape {
    private double radius;

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