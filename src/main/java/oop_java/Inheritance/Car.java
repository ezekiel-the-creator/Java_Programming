package oop_java.Inheritance;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors){
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors(){
        return numDoors;
    }

    public void setNumDoors(int numDoors){
        this.numDoors = numDoors;
    }

    public static void main(String... args){
        Car newCar = new Car("Nissan", "GTR", 2022, 4);
        newCar.drive(123);
        newCar.stop();
        System.out.println("Number of doors: " +newCar.getNumDoors());
    }
}
