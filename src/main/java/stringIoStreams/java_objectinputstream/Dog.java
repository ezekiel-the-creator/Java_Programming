package stringIoStreams.java_objectinputstream;

import java.io.Serializable;

public class Dog implements Serializable{
    String name;
    String breed;
    
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
}
