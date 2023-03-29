package oop_java.sealed_classes;

import oop_java.sealed_classes.Vehicle.Truck;

//A sealed class in java is one that restricts the set of classes that can extend it.
//It provides better control and encapsulation of a class hierarchy by allowing only a specific set of subclasses to be created.

//declaring a sealed class
public sealed class Vehicle permits Truck {
    // properties and methods
    public non-sealed class Truck extends Vehicle {
    // properties and methods specific to Truck
}
}



