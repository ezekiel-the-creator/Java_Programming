package oop_java.Encapsulation;

public class Area {
    //fields to calculate area
    int length;
    int width;

    Area(int length, int breadth) {
        this.length = length;
        this.width = width;
    }

    //method to calculate area
    public void getArea() {
        int area = length * width;
        System.out.println("Area = ");
    }
}
