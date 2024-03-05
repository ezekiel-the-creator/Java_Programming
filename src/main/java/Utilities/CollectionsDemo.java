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
        System.out.println("
    ")
    }
}
