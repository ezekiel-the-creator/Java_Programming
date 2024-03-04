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

    private static void concat(){
        Sytem.out.println("\nString method concat():");
        String s7 = "42";
        String s8 = "xyz";
        String newStr1 = s7.concat(s8);
        System.out.println(newStr1);

        String newStr2 = s7 + s8;
        System.out.println(newStr2);
    }

    private static void join(){
        System.out.println("\nString method join():");
        String newStr1 = String.join(",", "abc", "xyz";
        System.out.println(newStr1);

        List<String> list = List.of("abc", "xyz");
        String newStr2 = String.join(",", list);
        System.out.println(newStr2);
    }

    private static void compareTo() {
        System.out.println("\nString methods compareTo() and compareToIgnoreCase():");
        String s4 = "aBc";
        String s5 = "Abc";
        System.out.println(s4.compareTo(s5));
        System.out.println(s4.compareToIgnoreCase(s5));
        System.out.println(s4.codePointAt(0));
        System.out.println(s5.codePointAt(0))
    }

    private static void matches(){
        System.out.println("\nString method matches():");
        System.out.println("abc".matches("[a-z]+"));
        System.out.println("abc1".matches("[a-z]+"));
    }

    private static void format (){
        System.out.println("\nString method format():");
        String t = "Hey, %s! Give me %d apples, please!";
        System.out.println(String.format(t, "Nick", 2));
        String t1 = String.format(t, "Nick", 2);
        System.out.println(t1);
        System.out.println(String.format("Hey, %s! Give me %d apples, please", "Nick", 2));
    }

    private static void toLowerUpperCase(){
        System.out.println("\nString methods toLowerCase() and toUpperCase():");
        System.out.println("aBc".toLowerCase());
        System.out.println("aBc".toUpperCase());
    }

    private static void isEmpty(){
        System.out.println("\nString method isEmpty():");
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
    }

    private static void split(){
        System.out.println("\nString method split():");
        String[] arr = "abcabc".split("b");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }

    private static valueOf(){
        System.out.println("\nString method valueOf():");
        float f = 23.42f;
        String sf = String.valueOf(f);
        System.out.println(sf);
    }

    private static void repeat(){
        System.out.println("\nString method repeat():");
        System.out.println("ab".repeat(3));
        System.out.println("ab".repeat(1));
        System.out.println("ab".repeat(0));
    }

    private static void isBlank(){
        System.out.println("\nString method isBlank():");
        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        System.out.println(" b ".isBlank());
    }

    private static void strip(){
        System.out.println("\nString method strip():");
        String sp = "  abc  ";
        System.out.println("'" + sp + "'");
        System.out.println("'" + sp.stripLeading() + "'");
        System.out.println("'" + sp.stripTrailing() + "'");
        System.out.println("'" + sp.strip() + "'");
    }

    private static void lines(){
        System.out.println("\nString method lines(): \n");
        String line = "Line 1\nLine 2\rLine 3\r\nLine 4";
        line.lines().forEach(System.out::println);
    }

    private static void trim(){
        System.out.println("\nStringUtils methods trim():\n");

        System.out.println("'" + StringUtils.trim(" x ") + "'");
        System.out.println(StringUtils.trim(null));
        System.out.println("'" + StringUtils.trim("") + "'");
        System.out.println("'" + StringUtils.trim("   ") + "'");

        
    }
}
