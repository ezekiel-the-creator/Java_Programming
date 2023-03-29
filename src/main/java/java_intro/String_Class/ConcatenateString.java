package java_intro.String_Class;

public class ConcatenateString {
    public static void main(String... args){
        String firstName = "Ezekiel";
        String LastName = "Kiprotich";

        //Concatenation using `+` operator
        String fullName = firstName + " " +LastName;

        //Concatenation using   `concat()` method
        String fullName1 = firstName.concat(" ").concat(LastName);

        System.out.println(fullName);
        System.out.println(fullName1);
    }
}
