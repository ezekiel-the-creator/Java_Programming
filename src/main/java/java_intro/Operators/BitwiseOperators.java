package java_intro.Operators;

public class BitwiseOperators {
    public static void main(String... args){
        //used to perforom bit-level operations on variables.

        int a = 10;//1010 in binary
        int b = 5;//0101 in binary

        int c = a & b;//c will be 0 -> 0000
        int d = a | b;//d will be 15 -> 1111
        int e = a ^ b;//e will be 15 -> 1111
        int f = ~a;//f will be -11 -> 0101
        int g = ~b;//g will be -6

        System.out.println("\nThe value of c is"+c+"\nThe value of d is "+d+"\nThe value of e is "+e+"\nThe value of f is "+f);
        System.out.println(g);
    }
}
