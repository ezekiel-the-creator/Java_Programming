package stringIoStreams;

import java.io.FileInputStream;

public class SkipMethod {
    public static void main(String... args){
        try{
            FileInputStream input = new FileInputStream("input.txt");

            input.skip(4);
            System.out.println("Input stream after skipping");
        }
    }
}