package java_fundamentals;

public class WideningNarrowing {
    public static void main(String... args){
        widening();
        narrowing();
        usingWrapperClasses();
    }

    private static void widening(){
        int i = 123456789;
        double d = (double)i;
        System.out.println(i - (int)d);

        long l1 = 12345678L;
        float f1 = (float)l1;
        System.out.println(l1 - (long)f1);

        long l2 = 123456789L;
        float f2 = (float)l2;
        System.out.println(l2 - (long)f2);

        long l3 = 12345678999999999L;
        double d3 = (double)l3;
        System.out.print(l3 - (long)d3);

        long l4 =1234567891111111L;
        double d4 = (double)l4;
        System.out.println(l4 - (long)d4);
    }

    private static void narrowing(){
        System.out.println(Integer.MAX_VALUE);//2147483647
        double d2 = 1234557.0;
        System.out.println(d2);//prints1234557

        double d9 = 12345678909999999999999.0;//Integer type isn't enough to hold all this figure
        System.out.println((int)d9);//prints 2147483647
    }

    private static void usingWrapperClasses(){
        long l1 = 12345678L;
        float f1 = Long.valueOf(l1).floatValue();
        System.out.println(l1 - (long)f1);
    }
}
