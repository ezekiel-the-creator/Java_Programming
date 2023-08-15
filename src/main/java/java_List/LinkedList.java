package java_List;
import java.util.List;
import java.util.LinkedList;

class Main {
    public static void main(String... args){
        List<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println("List: " + numeros);

        //Access elements from the list
        int number = numeros.get(2);
        System.out.println("Accessed Element: " + number);

        //Using indexOf() method
        int index = numeros.indexOf(2);
        System.out.println("Position of 3 is " + index);

        //Remove element from the list
        int removedNumber = numeros.remove(2);
        System.out.println("Removed Element: " + removedNumber);
    }    
}
