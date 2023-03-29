//Return statement is used to exit a method and return a value to the caller
package java_intro.Flow_Control;


public class return_branching {
    public static void main(String... args){
        int result = sum(6, 7);
        System.out.println("The result is: " + result);
    }    

    private static int sum(int a, int b){
        int total = a + b;
        return total; //returns value to the sum caller
    }
}
