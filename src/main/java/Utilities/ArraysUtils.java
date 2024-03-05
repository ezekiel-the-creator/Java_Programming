package Utilities;

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
    }
}
