package java_intro.Flow_Control;

public class Continue {
    public static void main(String... args){
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.println("Skipping even number: " + numbers[i]);
                continue;
            }

            System.out.println("Current number is: " + numbers[i]);
        }
    }
}
