//A sealed class in java is one that restricts the set of classes that can extend it.
//It provides better control and encapsulation of a class hierarchy by allowing only a specific set of subclasses to be created.

public sealed class Vehicle permits Car, Truck, Motorcycle {
    // properties and methods
}

public final class Car extends Vehicle {
    // properties and methods specific to Car
}

public non-sealed class Truck extends Vehicle {
    // properties and methods specific to Truck
}

public final class Motorcycle extends Vehicle {
    // properties and methods specific to Motorcycle
}
