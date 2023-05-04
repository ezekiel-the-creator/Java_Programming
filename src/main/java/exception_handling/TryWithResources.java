package exception_handling;
import java.io.*;
import java.util.*;
class TryWithResources {
    public static void main(String... args){
        try (Scanner scanner = new Scanner(new File("testRead.txt"));
            PrintWriter writer = new PrintWriter(new File("testWrite.txt"))){
                while (scanner.hasNext()){
                    writer.print(scanner.nextLine());
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
}