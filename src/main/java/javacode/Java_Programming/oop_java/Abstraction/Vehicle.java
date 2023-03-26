package javacode.Java_Programming.oop_java.Abstraction;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void start();
    public abstract void stop();
    public void drive(int speed){
        System.out.println("Driving the vehicle at " + speed + " mph...");
    }
}
