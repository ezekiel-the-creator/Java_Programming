package java_intro.Operators;

public class RelationalOperators {
    public static void main(String... args){
        //relational operators are used to compare two values or variables and return a boolean(true or false)

        int a = 3;
        int b = 6;
        boolean isEqual = a == b;//false
        boolean isNotEqual = a != b;//true
        boolean isGreater = a > b;//false
        boolean isLess = a < b;//true
        boolean isGreaterOrEqual = a >= b;//false
        boolean isLessOrEqual = a <= b;//true

        System.out.println(isEqual);
        System.out.println(isNotEqual);
        System.out.println(isGreater);
        System.out.println(isLess);
        System.out.println(isGreaterOrEqual);
        System.out.println(isLessOrEqual);

    }
}
