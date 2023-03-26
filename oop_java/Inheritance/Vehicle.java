package javacode.Java_Programming.oop_java.Inheritance;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("Starting the vehicle...");
    }

    public void stop(){
        System.out.println("Stopping the vehicle...");
    }

    public void drive(int speed){
        System.out.println("Driving the vehicle at " + speed + " mph...");
    }
}
