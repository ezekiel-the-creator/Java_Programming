package libraries;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.OrderedMap;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.collections4.map.LinkedMap;

import java.util.Map;

public class Collections4 {
    public static void main(String... args){
        bag();
        bidiMap();
        iterableMap();
        orderedMap();
    }

    private static void bag(){
        System.out.println("\nbag():");

        Bag<String> bag = new HashBag<>();
        bag.add("One", 4);
        System.out.println(bag);
        bag.remove("one", 1);
        System.out.println(bag);
        System.out.println(bag.getCount("one"));
    }

    private static bidiMap(){
        System.out.println("\nbidiMap():");

        BidiMap<Integer, String> bidi = new TreeBidiMap<>();
        bidi.put(2, "two");
        bidi.put(3, "three");
        System.out.println(bidi);
        System.out.println(bidi.inverseBidiMap());
        System.out.println(bidi.get(3));
        System.out.println(bidi.getKey("three"));
        bidi.removeValue("three");
        System.out.println(bidi);
    }

    private static void iterableMap(){
        System.out.println("\niterableMap():");

        IterableMap<Integer, String> map = new HashedMap<>(Map.of(1, "one", 2, "two"));
        MapIterator it = map.mapIterator();
        while (it.hasNext()){
            Object key = it.next();
            Object value = it.getValue();
            System.out.print(key + ", " + value + ", ");
            if(((Integer)key) == 2){
                it.setValue("three");
            }
        }
        System.out.println("\n" + map);
    }

    private static void orderedMap(){
        System.out.println("\norderedMap():");

        OrderedMap<Integer, String> map = new LinkedMap<>();
        map.put(4, "four");
        map.put(7, "seven");
        map.put(12, "twelve");

        System.out.println(map.firstKey());
        System.out.println(map.nextKey(2));
        System.out.println(map.nextKey(7));
        System.out.println(map.nextKey(4));
    }
}
