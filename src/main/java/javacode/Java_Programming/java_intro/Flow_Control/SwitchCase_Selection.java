package javacode.Java_Programming.java_intro.Flow_Control;

public class SwitchCase_Selection {
    public static void main(String... args){
        int dayOfWeek = 2;

        switch (dayOfWeek){
            case 1:
            System.out.println("Today is Monday.");
            break;
            case 2:
            System.out.println("Today is Tuesday.");
            break;
            case 3:
            System.out.println("Today is Wednesday.");
            break;
            case 4:
            System.out.println("Today is Thursday.");
            break;
            case 5:
            System.out.println("Today is Friday.");
            break;
            case 6:
            System.out.println("Today is Saturday.");
            case 7:
            System.out.println("Today is Sunday.");
            break;
            default:
            System.out.println("Invalid day of week.");
        }
    }
}
