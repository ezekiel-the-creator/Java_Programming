package Utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String... args) {
        initialize1();
        initialize2();
        initialize3();
        initialize4();
        initialize5();
        iterable();
        equals();
        copyOf();
        ListIterator();
        sort1();
        sort2();
        map();
        unmodifiable();
    }

    private static void unmodifiable(){
        System.out.println("\nmodifiable():");

        Person1 p1 = new Person1(45, "Ezek");
        List<Person1> list = List.of(p1);
        //list.add(new Person1(22, "Bob")) //UnsupportedOperationExeption
        System.out.println(list);
        p1.setName("Kelly");
        System.out.println(list);
    }

    private static void intialize1(){
        System.out.println("\nInitalize1():");

        //Collection<String> coll = List.of("s1", null); //does not allow null
        Collection<String> coll = List.of("s1", "s1", "s2");
        //coll.add("s3"); //does not allow add element
        //((List<String>) coll).set(1, "s3"); //does not allow modify element
        //coll.remove("s1"); //does not allow remove element
        System.out.println(coll); //prints: [s1, s1, s2]

        //coll = Set.of("s3", "s3", "s4"); //does not allow duplicate
        //coll = Set.of("s2", "s3", null); // does not allow null
        coll = Set.of("s3", "s4");
        System.out.println(coll); //prints: [s3, s4] or [s4, s3]

        //coll.add("s5");
        //coll.remove("s2");
    }
    
    private static void initialize2(){
        System.out.println("\ninitialize2():");

        List<String> list1 = new ArrayList<>();
        list1.add("s1");
        list1.add("s1");
        System.out.println(list1);

        Set<String> set1 = new HashSet<>();
        set1.add("s1");
        set1.add("s1");
        System.out.println(set1);
    }
}
