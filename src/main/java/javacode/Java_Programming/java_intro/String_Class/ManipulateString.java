package javacode.Java_Programming.java_intro.String_Class;

public class ManipulateString {
    public static void main(String... args){
        String s1 = "Venus";
        String s2 = "Mars";
        String s3 = "Jupiter";
        String s4 = "Neptune";


        //String Manipulation
        int len = s3.length();
        String s5 = s4.substring(0, 4);
        String s6 = s3.toLowerCase();
        String s7 = s2.toUpperCase();
        String s8 = s1.replace("s", "m");

        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.print(len);

    }
}
