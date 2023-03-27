//final methods cannot be overriden by a subclass

public class Vehicle {
    int weight;
    int baseArea;

    public final int speedometer(){
        int speed = weight* baseArea;

        return speed;
    }
}

//trying to override speedometer() will result to a compile time error.
