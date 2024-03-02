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
}
