package java_Queue;
import java.util.ArrayDeque;

class JArrayDeque {
    public static void main(String... args){
        ArrayDeque<String> animals = new ArrayDeque<>();
        animals.add("Cat");
        animals.addLast("Horse");
        System.out.println("ArrayDeque: "+ animals);
    }
}
