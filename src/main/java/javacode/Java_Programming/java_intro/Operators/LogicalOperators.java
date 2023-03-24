package javacode.Java_Programming.java_intro.Operators;

public class LogicalOperators {
    public static void main(String... args){
        //used to combine two or more conditions and return a boolean value

        int a = 10;
        int b = 5;

        boolean result1 = (a>b) && (a< 20);//true
        boolean result2 = (a>b) || (a<5);//true
        boolean result3 = !(a > b);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
