package java_fundamentals;

public class WideningNarrowing {
    public static void main(String... args){
        
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
}
