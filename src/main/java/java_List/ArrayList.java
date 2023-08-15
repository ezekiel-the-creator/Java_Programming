package java_List;
import java.util.List;
import java.util.ArrayList;


class Main {
    public static void main(String... args){
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println("Accessed Element: " + numeros);

        //Remove element from the list
        int removedNumber = numeros.remove(1);
        System.out.println("Removed Element: " + removedNumber);
    }
}
