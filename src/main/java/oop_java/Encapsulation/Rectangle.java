package oop_java.Encapsulation;

public class Rectangle {
    //fields to calculate area
    int length;
    int width;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.width = width;E
    }

    //method to calculate area
    public void getArea() {
        int area = length * width;
        System.out.println("Area = " + area);
    }
}
