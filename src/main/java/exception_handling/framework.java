package exception_handling;

import java.util.concurrent.TimeUnit;

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

            } else {
                
            }
        }
    }

    private static void catchException2(){
        try {
            method(s:null);
        } catch (NullPointerException ex){
            System.out.println("\ncatchException2():");
            waitForStackTrace();
            ex.printStackTrace();
        } catch(Exception ex){
            waitForStackTrace();
            ex.printStackTrace();
        }
    }

    private static void catchException3(){
        Exception exception = null;
        try {
            method(s:null);
        } catch (NullPointerException ex){
            System.out.println("\ncatchException3():");
            exception = ex;
        } catch (Exception ex){
            exception = ex;
        } finally {
            if(exception != n)
        }
    }
}
