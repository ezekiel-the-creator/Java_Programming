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

            System.out.println("Available bytes after reading: " + input.available());
            
            input.close();
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}