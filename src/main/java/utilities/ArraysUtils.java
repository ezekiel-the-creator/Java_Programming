package utilities;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class ArraysUtils {
    public static void main(String... args){
        equalsDemo();
        arrayUtils();
    }

    private static void equalsDemo(){
        System.out.println("\nequalsDemo:");

        String[] arr1 = {"s1", "s2"};
        String[] arr2 = {"s1", "s2"};
        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.deepEquals(arr1, arr2));

        String[][] arr3 = {{"s1", "s2"}};
        String[][] arr4 = {{"s1", "s2"}};
        System.out.println(arr3.equals(arr4));
        System.out.println(Arrays.equals(arr3, arr4)); //false
        System.out.println(Arrays.deepEquals(arr3, arr4)); //true
        
        Integer[][] ar1 = {{42}};
        Integer[][] ar2 = {{42}};
        System.out.print(Arrays.equals(ar1, ar2) + " ");
        System.out.println(Arrays.deepEquals(arr3, arr4));
    }

    private static void arrayUtils(){
        System.out.println("\narrayUtils():");

        String[] arr1 = { "s1", "s2" };
        String[] arr2 = { null };
        String[] arr3 = null;

        System.out.print(ArrayUtils.getLength(arr1) + " "); //prints: 2
        System.out.print(ArrayUtils.getLength(arr2) + " "); //prints: 1
        System.out.print(ArrayUtils.getLength(arr3) + " "); //prints: 0
        System.out.println(ArrayUtils.isEmpty(arr2));       //prints: false
        System.out.println(ArrayUtils.isEmpty(arr3));       //prints: true
    }
}
