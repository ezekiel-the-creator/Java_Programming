package stringIoStreams;

import java.io.FileInputStream;

public class AvailableMethod {
    public static void main (String... args){
        try{
            FileInputStream input = new FileInputStream("input.txt");

            System.out.println("Available bytes at the beggining: " + input.available());

            input.read();
            input.read();
            input.read();
        }
    }
}