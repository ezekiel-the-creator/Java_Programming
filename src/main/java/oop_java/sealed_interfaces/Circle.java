package oop_java.sealed_interfaces;

public final class Circle implements Shape {
    private double radius;

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