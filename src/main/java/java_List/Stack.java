package java_List;
import java.util.Stack;

class JStack {
    public static void main(String... args){
        Stack<Integer> numbers = new Stack<>();
        numbers.push(3);
        numbers.push(4);
        numbers.push(5);

        System.out.println("Stack: " + numbers);
    }
}
