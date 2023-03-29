package oop_java.abstraction;

public class Car extends Vehicle{
    private int numDoors;

    public Car(String make, String model, int year, int numDoors){
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void start(){
        System.out.println("Starting the car...");
    }

    @Override
    public void stop(){
        System.out.println("Stopping the car...");
    }

    public void setNumDoors(int numDoors){
        this.numDoors = numDoors;
    }

    public static void main(String... args){
        Car myCar = new Car("Toyota", "Hillux", 2022, 4);
        myCar.start();
        myCar.drive(100);
        myCar.stop();
        System.out.println("Number of doors: " + myCar.getNumDoors());
    }

    private int getNumDoors() {
        return numDoors;
    }
}
