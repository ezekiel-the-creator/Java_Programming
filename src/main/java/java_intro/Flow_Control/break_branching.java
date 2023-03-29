package java_intro.Flow_Control;

public class break_branching {
    public static void main(String... args){
        int[] numbers = {1, 2, 3, 4, 5};

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.println("Found an even number: " + numbers[i]);
                break;
            }

            System.out.println("Current number is: " + numbers[i]);
        }
    }
}
