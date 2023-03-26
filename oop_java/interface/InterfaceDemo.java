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