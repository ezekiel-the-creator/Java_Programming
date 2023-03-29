package oop_java.FinalKeyword;

//A final class cannot be extended by any subclass, trying to do so will result to a compile time error

public final class finalclass {
    int a;
    int b;

    public int Sum(int a, int b) {
        int sum = a + b;

        return sum;
    }
}
