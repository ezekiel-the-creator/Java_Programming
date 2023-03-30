package java_fundamentals;

import  oop_java.Inheritance.Vehicle;

public class Packages {
    private static String Land_cruiser;
    private static String Toyota;

    public static void main(String... args){
        Vehicle v16 = new Vehicle(Toyota, Land_cruiser, 2019);
        v16.drive(189);
    }
}
