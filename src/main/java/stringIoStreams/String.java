package stringIoStreams;

import org.apache.commons.lang3.StringUtils;
import java.util.List;

public class String {
    public static void main(String... args) {
        equals();
        contains();
        StartsEndsWith();
        length();
        indexOf();
        substring();
        concat();
        join();
        compareTo();
        matches();
        format();
        replace();
        toLowerUpperCase();
        split();
        isEmpty();
        valuesOf();
        repeat();
        isBlank();
        strip();
        lines();

        //stringUtils
        trim();
    }

    private static void equals() {
        System.out.println("\nString method equals():");
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "adc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("abc".equals(s2));
        System.out.println("abc".equals(s3));

        System.out.println("\nString method equalsIgnoreCase():");
        String s4 = "aBc";
        String s5 = "Abc";
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));

        System.out.println("\nString method contentEquals():");
        System.out.println(s1.contentEquals(s2));
        System.out.println("abc".contentEquals(s2));

    }

    private static void contains(){
        System.out.println("\nString method contains():");
        String s6 = "abc42t%";
        String s7 = "42";
        String s8 = "xyz";
        System.out.println(s6.contains(s7));
        System.out.println(s6.contains(s8));
    }

    private static void startsEndsWith(){
        System.out.println("\nString methods startswith(), endWith():");
        String s6 = "abc42t%";
        String s7 = "42";
        System.out.println(s6.startsWith(s7));
        System.out.println(s6.startsWith("ab"));
        System.out.println(s6.startsWith("42", 3));
        System.out.println(s6.endsWith(s7));
        System.out.println(s6.endsWith("t%"));
    }

    private static void length(){
        System.out.println("\nString method length():");
        String s7 = "42";
        System.out.println(s7.length());
        System.out.println("0 0".length());
    }

    private static void indexOf(){
        System.out.println("\nString methods indexOf(), lastIndexOf():");
        String s6 = "abc42t%";
        String s7 = "42";
        System.out.println(s6.indexOf(s7));
        System.out.println(s6.indexOf("a"));
        System.out.println(s6.indexOf("xyz"));
        System.out.println("ababa".lastIndexOf("ba"));

    }
}
