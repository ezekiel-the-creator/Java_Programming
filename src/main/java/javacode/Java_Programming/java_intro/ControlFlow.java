package javacode.Java_Programming.java_intro;

import java.util.Random;

public class ControlFlow {
    public static void main(String... args){
        selection();
    }

    private static void selection(){
        System.out.println("\nSelection statements: ");
        Random rand = new Random();
        int x = rand.nextInt(7) + 1;
        int y = 2;
        System.out.println(x);

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

}
