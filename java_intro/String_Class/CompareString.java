package javacode.Java_Programming.java_intro.String_Class;

public class CompareString {
    public static void main(String... args){
        String s1 = "trappist-1";
        String s2 = "kepler-90";
        String s3 = "trappist-1";

        //Comparing strings using equal sign, true if the sequence of character are the same.
        boolean b1 = s1.equals(s2);
        boolean b2 = s1.equals(s3);

        System.out.println(b1);
        System.out.println(b2);

        //Comparing strings using the `compareTo()` method, compares string lexicographically and returns either zero, positive integer, or negative integer
        int i1 = s1.compareTo(s2);
        int i2 = s1.compareTo(s3);
        int i3 = s2.compareTo(s1);

        System.out.println(i1);//9
        System.out.println(i2);//0
        System.out.println(i3);//-9
    }
}
