//flush () method is used to clear the output stream, it forces the output stream to write all data to the destionation

package stringIoStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FlushMethod {
    public static void main(String... args) throws IOException{
        FileOutputStream out = null;
        String data = "This is the demo of flush method";

        try {
            out = new FileOutputStream("flush.txt");
            out.write(data.getBytes());

            out.flush();
            out.close();
        }catch (Exception e) {
            e.getStackTrace();
        }
    }
}