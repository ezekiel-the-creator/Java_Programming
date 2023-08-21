package java_Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Iterator;

public class LinkedBlockngQueue {
    public static void main(String args[]){
        LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("LinkedBlockingQueue: " + animals);

        String elemtn = animals.peek();
        System.out.println("Accessed element: " + elemtn);
        
        Iterator<String> iterate = animals.iterator();
        System.out.println("LinkedBlockingQueue Elements: ");

        while(iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.println(", ");
        }
    }
}
