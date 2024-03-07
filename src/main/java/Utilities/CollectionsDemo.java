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

import afu.org.checkerframework.checker.units.qual.C;
import oop_java.Encapsulation.Person;
import stringIoStreams.Person1;

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

    private static void initailize3(){
        System.out.println("\ninitialize3():");

        List<String> list1 = new ArrayList<>();
        list1.add("s1");
        list1.add("s1");
        System.out.println(list1); //[s1, s1]

        List<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        System.out.println(list2);

        Set<String> set = new HashSet<>();
        set.addAll(list1);
        System.out.println(set);

        Set<String> set1 = new HashSet<>();
        set1.add("s1");

        Set<String> set2 = new HashSet<>();
        set2.add("s1");
        set2.add("s2");

        System.out.println(set1.addAll(set2));
        System.out.println(set1);
    }

    private static void initialize4(){
        System.out.println("\ninitialize4():");

        Set<String> set = new HashSet<>();
        System.out.println(set.add("s1"));
        System.out.println(set.add("s1"));
        System.out.println(set);

        Set<String> set1 = new HashSet<>();
        set1.add("s1");
        set1.add("s2");
        
        Set<String> set2 = new HashSet<>();
        set2.add("s1");
        set2.add("s2");

        System.out.println(set1.addAll(set2));
        System.out.println(set1);
    }

    private static void initialize5(){
        System.out.println("\ninitialize5():");

        Collection<String> list1 = List.of("s1", "s2", "s2");
        System.out.println(list1);

        List<String> list2 = new ArrayList<>(list1);
        System.out.println(list2);

        Set<String> set = new HashSet<>(list1);
        System.out.println(set);

        List<String> list3 = new ArrayList<>(set);
        System.out.println(list3);
    }

    private static void iterable(){
        System.out.println("\nIterable():");

        Iterable<String> list = List.of("s1", "s2", "s3");
        System.out.println(list);

        for(String e: list){
            System.out.print(e + " ");
        }
        System.out.println();
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    private static void equals(){
        System.out.println("\nequals():");

        Collection<String> list1 = List.of("s1", "s2", "s3");
        System.out.println(list1);

        Collection<String> list2 = List.of("s1", "s2", "s3");
        System.out.println(list2);

        System.out.println(list1.equals(list2));

        Collection<String> list3 = List.of("s2", "s1", "s3");
        System.out.println(list3);

        System.out.println(list1.equals(list3));

        Collection<String> set1 = Set.of("s1", "s2", "s3");
        System.out.println(set1);

        Collection<String> set2 = Set.of("s2", "s1", "s3");
        System.out.println(set2);

        System.out.println(set1.equals(set2));

        Collection<String> set3 = Set.of("s4", "s1", "s3");
        System.out.println(set3);

        System.out.println(set1.equals(set3));
    }

    private static void copyOf(){
        System.out.println("\ncopyOf():");

        Collection<String> list = List.of("s1", "s2", "s3");
        System.out.println(list);

        List<String> list1 = List.copyOf(list);
        //list1.add("s4");      //run-time error
        //list1.set(1, "s5");       //run-time error
        //list1.remove("s1");

        Set<String> set = new HashSet<>();
        System.out.println(set.add("s1"));
        System.out.println(set);

        Set<String> set1 = Set.copyOf(set);
        //set1.add("s2");       //run-time error
        //set1.remove("s1");    //run-time error

        Set<String> set2 = Set.copyOf(list);
        System.out.println(set2);
    }

    private static void listIterator(){
        System.out.println("\nlistIterator():");

        List<String> list = List.of("s1", "s2", "s3");
        ListIterator<String> li = list.listIterator();

        while(li.hasNext()){
            System.out.print(li.next() + " ");  //prints: s1 s2 s3
        }

        System.out.println();

        while(li.hasPrevious()){
            System.out.println(li.previous() + " ");
        }

        System.out.println();

        ListIterator<String> li1 = list.listIterator(1);
        while(li1.hasNext()){
            System.out.print(li1.next() + " ");
        }
        System.out.println();

        ListIterator<String> li2 = list.listIterator(1);
        while(li2.hasPrevious()){
            System.out.print(li2.previous() + " ");
        }
        System.out.println();
    }

    private static void sort1(){
        System.out.println("\nsort1():");

        List<String> list = new ArrayList<>();
        list.add("s2");
        list.add("s3");
        list.add("s1");
        System.out.println(list);       //prints: [S2, s3, s1]

        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(list);       //prints: [s1, S2, s3]

        list.sort(Comparator.naturalOrder());
        System.out.println(list);       //prints: [S2, s1, s3]

        list.sort(Comparator.reverseOrder());
        System.out.println(list);       //prints: [s3, s1, S2]

        list.add(null);
        list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(list);

        list.sort(Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.println(list);

        Comparator<String> comparator = (s1, s2) ->
            s1 == null ? -1 : s1.compareTo(s2);
        list.sort(comparator);
        System.out.println(list);       
    }

    private static void sort2(){
        System.out.println("\nsort2():");

        List<Person> list = new ArrayList<>();
        list.add(new Person(21, "Ezek"));
        list.add(new Person(19, "Gina"));
        list.add(new Person(21, "Mo"));
        list.add(new Person(30, "Mo"));

        System.out.println();
        list.forEach(System.out::println);

        list.sort(Comparator.naturalOrder());
        System.out.println();
        list.forEach(System.out::println);

        list.sort(Comparator.reverseOrder());
        System.out.println();
        list.forEach(System.out::println);

        list.sort(Comparator.comparing(Person::getName));
        System.out.println();
        list.forEach(System.out::println);

        list.sort(Comparator.comparing(Person::getAge));
        System.out.println();
        list.forEach(System.out::println);

        list.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        System.out.println();
        list.forEach(System.out::println);
    }
}
