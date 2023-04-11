//subclasses of the output stream

//FileOutputStream, ByteArrayStream, ObjectOutputStream
package stringIoStreams;

import java.io.OutputStream;
import java.io.FileOutputStream;

public class OutputStreamClass {
    public static void main(String... args){
        String data = "This is java.";
        try {
            OutputStream out = new FileOutputStream("output.txt");

            byte[] dataBytes = data.getBytes();
        }
    }
}