package javacode.Java_Programming.java_intro;

import java.util.Random;

public class ControlFlow {
    public static void main(String... args){
        selection();
        iteration();
    }

    private static void selection(){
        System.out.println("\nSelection statements: ");
        Random rand = new Random();
        int x = rand.nextInt(7) + 1;
        int y = 2;
        System.out.println(x);

        //if else, if else if else, if
        if (x > y) {
            System.out.println("X is greater than y");
        } else {
            System.out.println("y is greater than x");
        }

        if (x > y) {
            System.out.println("x is greater than y");
        } else if( x == y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("y is greater than x");
        }

        //Switch statement
        switch (x) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Today could be any of the days from Saturday to Friday");

        }

        //Enhanced switch statement
        switch(x){
            case 1, 7 -> System.out.println("x is 1 or 7");
            case 2 -> System.out.println("x is 2");
            case 5, 6 -> System.out.println("x is 5 or 6");
            default -> System.out.println("x is not 1,3,4,5,6");
        }
    }
    
    //Iteration statements: while, do while, for, 
    public static void iteration(){
        System.out.println("\nIteration statements");

        int n = 0;
        while(n > 5){
            System.out.println(n + " ");
            n++;
        }

        System.out.println();

        n = 0;
        do {
            System.out.println(n + " ");
            n++;
        } while(n < 5);
        System.out.println();

        for (int i = 0; i < 3; i++){
            System.out.println(i + " ");
        }
        System.out.println();

        for (int i = 0; i > -1; i++){
            System.out.println(i + " ");
            if(i > 1) break;
        }

        System.out.println("\n\nLoop 1:");
        for (int i = 0, j = 0; i < 3 && j < 3; ++i, ++j){
            System.out.println(i + " " + j);
        }

        System.out.println("\nLoop 2:");
        for (int x = getInitiatialValue(), i=x == -3 ? x + 3 : 0, j = 0; i < 4 || j < 4 ; ++i, j = i){
            System.out.println(i + " " + j);
        }

        System.out.println("\nIterate an array");
        int[] arr = {13, 14, 15, 16, 17, 18};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static int getInitiatialValue() {
        return 0;
    }

    public static void exception(){
        System.out.println("\nException statements: ");
        int x = 50;
        try {
    
            if(x>30){
                throw new RuntimeException("The x value is out of range: " + x);
                }
                
            } catch (RuntimeException ex){
                System.out.println(ex.getMessage());
        }
    }
}