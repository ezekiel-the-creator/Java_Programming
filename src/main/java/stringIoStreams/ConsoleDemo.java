package stringIoStreams;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class ConsoleDemo {
    public static void main(String... args){
        console();
    }

    private static void console(){
        System.out.println("\nconsole1:");
        Console console = System.console();
        System.out.println(console);
    }
}