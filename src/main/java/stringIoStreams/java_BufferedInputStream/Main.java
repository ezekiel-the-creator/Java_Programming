package stringIoStreams.java_BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import oop_java.FinalKeyword.finalclass;

public class Main { 
      public static void main(String... args) {
        try {
            FileInputStream file = new FileInputStream("java.txt");
            BufferedInputStream input = new BufferedInputStream(file);

            int i = input.read();

            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e){
            e.getStackTrace();
        }
      }
}
