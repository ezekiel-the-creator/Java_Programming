package stringIoStreams;

import java.io.FileOutputStream;

public class WriteMethod {
    public static void main(String... args) {
        String data = "This is a line of text inside the file";
        try {
            FileOutputStream output = new FileOutputStream("Output.txt");

            byte[] array = data.getBytes();

            output.write(array);
            output.close();
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}