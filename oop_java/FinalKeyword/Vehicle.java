public class Vehicle {
    int weight;
    int baseArea;

    public final int speedometer(){
        int speed = weight* baseArea;

        return speed;
    }
}
