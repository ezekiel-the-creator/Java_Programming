package oop_java.Interface;

public class Rectangle implements Shape{
    private double length;
    private double width;

    @Override
    public void getSides(){
        System.out.println("I am a rectangle, I have 4 sides");
    }

    public void getName(String name){
        System.out.println("Language: " + name);
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * length * width;
    }
}