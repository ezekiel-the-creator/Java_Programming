package stringIoStreams.java_ObjectOutputStream;

import java.io.Serializable;

public class Dog implements Serializable {
    String name;
    String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
}
