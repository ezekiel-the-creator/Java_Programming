package java_List;
import java.util.Vector;

class JVector {
    public static void main(String[] args){
        Vector <String> mammals = new Vector<>();

        mammals.add("Dog");
        mammals.add("Horse");
        mammals.add("Cat");
        System.out.println("Vector: " + mammals);

        //using addAll()
        Vector <String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
    }
}
