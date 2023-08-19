package java_Queue;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    public static void mai(String[] args){
        //creating Que using LinkedList class
        Queue<Integer> numbers = new LinkedList<>();

        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue: " + numbers);

        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        //Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
    }
}
