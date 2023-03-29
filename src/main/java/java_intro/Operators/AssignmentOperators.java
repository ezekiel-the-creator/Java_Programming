package java_intro.Operators;


public class AssignmentOperators {
    public static void main(String... args){
        //used to assign values to variables

        int a = 10;

        a += 5;//a is now 15
        a -= 2;//a is now 13
        a *= 3;//a is now 39
        a /= 4;//a is now 9
        a %= 2;//a is now 1

        System.out.println("Final value of a is " + a);
    }
}
