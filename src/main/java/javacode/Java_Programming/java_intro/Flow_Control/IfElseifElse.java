package javacode.Java_Programming.java_intro.Flow_Control;

public class IfElseifElse {
    public static void main(String... args){
        int age = 32;

        if (age < 18){
            System.out.println("You are a minor.");
        }else if(age >= 18 && age < 21){
            System.out.println("You are a young adult.");
        }else if(age>=21 && age < 65){
            System.out.println("You are an adult.");
        }else{
            System.out.println("You are a senior citizen.");
        }
    }
}
