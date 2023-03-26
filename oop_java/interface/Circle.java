interface Shape{
    double getArea();
    double getPerimeter();
}

public class Circle implements Shape {
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

class Rectangle implements Shape{
    private double length;
    private double width;

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

public class interfaceDemo {
    public static void main(String... args){
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(3, 4);

        System.out.println("circle area: " + circle.getArea());
        System.out.println("Circle perimete: " + circle.getPerimeter());

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
    }
}
