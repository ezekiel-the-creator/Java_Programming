package threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollections {
    
    public static void main(String... args){
        modifyCopyOnWriteArrayList();
    }

    private static void modifyList(){
        System.out.println("\nmodifyList():\n");
        List<String> list = Arrays.asList("one", "Two");
        System.out.println(list);
        try {
            for (String e: list) {
                System.out.println(e);
                list.add("Three");
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(list);
    }

    private static void modifyCopyOnWriteArrayList(){
        System.out.println("\nmodifyCopyOnWriteArrayList():\n");
        List<String> list = new CopyOnWriteArrayList<>(Arrays.asList("One", "Two"));
        System.out.println(list);
        try {
            for (String e : list) {
                System.out.println(e + " ");
                list.add("Three");
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("\n" + list);
    }
}
