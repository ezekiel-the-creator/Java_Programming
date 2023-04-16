package stringIoStreams.java_objectinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String... args) {

        int data1 = 5;
        String data2 = "This is programiz";
        Dog dog = new Dog("Tyler", "Labrador");

        try {
            FileOutputStream file = new FileOutputStream("file.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);

            // Writing to the file using ObjectOutputStream
            output.writeInt(data1);
            output.writeObject(data2);
            output.writeObject(dog);

            FileInputStream fileStream = new FileInputStream("file.txt");
            // Creating an object input stream
            ObjectInputStream objStream = new ObjectInputStream(fileStream);
            ObjectInputStream input = new ObjectInputStream(fileStream);

            Dog newDog = (Dog) input.readObject();

            // Using the readObject() method
            System.out.println("String data: " + objStream.readObject());
            System.out.println("Dog Name: " + newDog.name);
            System.out.println("Dog breed: " + newDog.breed);

            output.close();
            objStream.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
