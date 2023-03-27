//Method overloading is ability to define multiple methods with the same name in a single class, but with different parameters.

public class Calculator {
    public int add (int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }
}
