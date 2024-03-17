package jvm;

import jvm.example.ExampleClass;

public class MyApplication {
    public static void main(String... args){
        System.out.println("Hello, World! \n This is Java Programming");
        for(String arg: args) {
            System.out.print(arg + " ");
        }
        String p = System.getProperty("someParameter");
        System.out.println("\n" + p);

        int i = ExampleClass.multiplyByTwo(2);
        System.out.println(i);
    }
}
