package javacode.Java_Programming.java_intro.Flow_Control;

public class SwitchExpression {
    public static void main(String... args){
        String dayOfWeek = "Tuesday";

        String result = switch (dayOfWeek){
            case "Monday" -> "Today is the start of the work days of a week.";
            case "Tuesday", "Wednesday", "Thursday" -> "Today is a work day.";
            case "Friday" -> "Today is the end of the work week.";
            case "Saturday" -> "Today is the start of te weekend";
            case "Sunday" -> "Today is the last day of the weekend";
            default -> "Invalid day of week.";
        };
        System.out.println(result);
    }
}
