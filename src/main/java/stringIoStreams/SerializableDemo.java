package stringIoStreams;

import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;

public class SerializableDemo {
    public static void main(String... args){
        ObjectStreamClass osc1 = ObjectStreamClass.lookup(Person1.clas);
        printInfo(osc1);
    }
}
