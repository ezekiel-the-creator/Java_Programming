package stringIoStreams.java_BufferedOutputStream;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class Main {
    public static void main(String... args){
        String data = "This is a line of text inside the file";

        try{
            FileOutputStream file = new FileOutputStream("output.txt");
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();
            output.close();
        } catch(Exception e){
            e.getStackTrace();
        }
    }
}
