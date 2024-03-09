package utilities;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ObjectUtils {
    public static void main(String... args){
        equals();
        hash();
        tostring();
    }

    private static void equals(){
        System.out.println("\nequals():");
        String[][] x1 = {{"a", "b"}, {"x", "y"}};
        String[][] x2 = {{"a", "b"}, {"x", "y"}};
        String[][] y = {{"a", "b"}, {"y", "y"}};

        System.out.println(Objects.equals(x1, x2));
        System.out.println(Objects.equals(x1, y));      
        System.out.println(Objects.deepEquals(x1, x2)); 
        System.out.println(Objects.deepEquals(x1, y)); 
    } 

    private static void hash(){
        System.out.println("\nhash():");
        System.out.println(Objects.hash(42) == Objects.hashCode(42));  //prints: false
        System.out.println(Objects.hash("abc") == Objects.hashCode("abc"));  //prints: false
        System.out.println(Objects.hash(null));  //prints: 0
        System.out.println(Objects.hashCode(null));  //prints: 0
        System.out.println(Objects.hash(0));  //prints: 31
        System.out.println(Objects.hashCode(0));  //prints: 0
    }

    private static void tostring(){
        List<String> list = Arrays.asList("s1", null);
        for(String e: list){
            //String s = e.toString();  //NullPointerException
            String s = e == null ? "null" : e.toString();
        }
        System.out.println();
        for(String e: list){
            String s = Objects.toString(e);
            System.out.print(s + " "); //prints: s1 null
        }
        System.out.println();
        for(String e: list){
            String s = Objects.toString(e, "element was null");
            System.out.print(s + " "); //prints: s1 element was null
        }
    }
    

}
