package stringIoStreams.java_PrintStream_class;

import java.io.PrintStream;

public class Main {
     public static void main(String... args){
        String data = "This is a text inside the file";
        int age = 20;

        try {
            PrintStream output = new PrintStream("output.txt");

            output.print(data);
            output.printf("I am %d years old", age);
            output.close();
        } catch (Exception e){
            e.getStackTrace();
        }
     }   
}
