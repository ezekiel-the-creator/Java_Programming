package java_intro.Flow_Control;

import java.util.Scanner;

public class Calculator{
	public static void main(String... args) {	
		
		try(Scanner input = new Scanner(System.in)){
			System.out.println("Enter the first number: ");
			int a = input.nextInt();
			System.out.println("Enter the second number: ");
			int b = input.nextInt();
			System.out.println("Enter the operator; +, -, *, /: ");
			int operand = input.next().charAt(0);

            int result;

            switch(operand){
                case '+' :
                result = a + b;
                break;
                
                case '-' :
                result = a - b;
                break;
                
                case '*':
                result = a * b;
                break;
                
                case '/':
                result = a / b;
                break;
                
                default :
                System.out.println("Unknown operand");
                return;
            }
            System.out.println(a + " " + operand +" " +  b + "  =  "  + result);
		}
	}
}	