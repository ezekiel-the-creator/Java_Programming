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
}
