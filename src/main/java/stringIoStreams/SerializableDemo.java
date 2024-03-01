package stringIoStreams;

import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;

public class SerializableDemo {
    public static void main(String... args){
        ObjectStreamClass osc1 = ObjectStreamClass.lookup(Person1.clas);
        printInfo(osc1);

        ObjectStreamClass osc2 = ObjectStreamClass.lookup(Person2.class);
        System.out.println("osc2: " + osc2);

        ObjectStreamClass osc3 = ObjectStreamClass.lookupAny(Person2.class);
        printInfo(osc3);
    }
}
