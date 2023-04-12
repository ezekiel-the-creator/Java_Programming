package stringIoStreams;

import java.io.FileInputStream;

public class SkipMethod {
    public static void main(String... args){
        try{
            FileInputStream input = new FileInputStream("input.txt");

            input.skip(4);
            System.out.println("Input stream after skipping");
            int i = input.read();

            while ( i != -1){
                System.out.println((char)i);
                i = input.read();
            }
            input.close();
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}