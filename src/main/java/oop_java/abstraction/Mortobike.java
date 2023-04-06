package oop_java.abstraction;

import java.text.NumberFormat.Style;

public abstract class Mortobike {
    abstract void brake();
}

class SportsBike extends Mortobike {
    //implementation of the abstract method
    public void brake(){
        System.out.println("SportsBike brake");
    }
}

class MountainBike extends Mortobike {
    public void brake(){
        System.out.println("MountainBike brake");
    }
}

class Main {
    public static void main(String... args){
        MountainBike m1 = new MountainBike();
        m1.brake();
        SportsBike s1 = new SportsBike();
        s1.brake();
    }
}
