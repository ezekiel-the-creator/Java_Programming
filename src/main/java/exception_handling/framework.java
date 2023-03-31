package exception_handling;

public class framework {
    
    public static void main(String... args){
        catchException1();
        catchException2();
        catchException3();
    }

    private static void method(String s){
        if(s.equals("abc")){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

    private static void catchException1(){
        System.out.println();
        try {
            method(s:null);
        } catch(Exception ex){
            System.out.println("CatcException1():");
            System.out.println(ex.getClass().getCanonicalName());
            waitForStackTrace();
            ex.printStackTrace();
            if(ex instanceof NullPointerException){
                
            }
        }
    }
}
