package oop_java.Interface;

public class InterfaceDemo {
    public static void main(String... args){

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(3, 4);

        System.out.println("circle area: " + circle.getArea());//getArea method defined in class Circle is implemented
        System.out.println("Circle perimete: " + circle.getPerimeter());

        System.out.println("Rectangle area: " + rectangle.getArea());//getArea method defined in class Rectanle is implemented
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
    }
}
