package oop_java.object_class;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("Starting the car...");
    }

    public void stop(){
        System.out.println("Stopping the car...");
    }

    public void drive(int speed){
        System.out.println("Driving the car at " + speed + " mph...");
    }

    public static void main(String... args){
        Car mycar = new Car("Toyota", "Camry", 2023);

        mycar.start();
        mycar.drive(179);
        mycar.stop();
    }
}
