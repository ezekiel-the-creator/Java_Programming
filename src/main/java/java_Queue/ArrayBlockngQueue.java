package java_Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockngQueue {
    public static void main(String args[]){
        BlockingQueue<Integer> numeros = new ArrayBlockingQueue<>(5);

        try {
            numeros.put(2);
            numeros.put(4);
            numeros.put(1);
            System.out.println("BlockingQueue: " + numeros);

            int removedNumeros = numeros.take();
            System.out.println("Removed Number: " + removedNumeros);
        }
        
        catch(Exception e) {
            e.getStackTrace();
        }
    }
    
}
