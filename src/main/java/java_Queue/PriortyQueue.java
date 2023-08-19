package java_Queue;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriortyQueue {
    public static void main(String... args){
        Queue<Integer> numbers = new PriorityQueue<>();

        numbers.offer(4);
        numbers.offer(8);
        numbers.offer(11);
        System.out.println("Queue: " + numbers);

        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);
        
        System.out.println("Updated Queue: " + numbers);
    }
}
