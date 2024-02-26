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

    private static void console2(){
        System.out.println("\nconsole2:");
        Console console = System.console();

        System.out.print("Enter something 1: ");
        String line = console.readLine();
        System.out.println("Entered 1: " + line);
        line = console.readLine("Enter something 2: ");
        System.out.println("Entered 2: " + line);
        line = console.readLine("Enter some%s", "thing 3 ");
        System.out.println("Entered 3: " + line);

        System.out.print("Enter password: ");
        char[] password = console.readPassword();
        System.out.println("Entered 4: " + new String(password));
        password = console.readPassword("Enter password 5: ");
        System.out.println("Entered 5 " + new String(password));
        System.out.println("Entered 6: " + new String(password));
    }

    private static void console3(){
        System.out.println("\nconsole3:");
        Console console = System.console();

        try (Reader reader = console.reader()){
            char[] chars = new char[10];
            System.out.print("Entered: " + new String(chars));
        }
    }
}