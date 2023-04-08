package java_intro.Flow_Control;

import java.util.Scanner;

public class Calculator{
	public static void main(String... args) {
		int a;
		int b;
		char operand;
		
		
		try(Scanner input = new Scanner(System.in)){
			System.out.println("Enter the first number: ");
			a = input.nextInt();
			System.out.println("Enter the second number: ");
			b = input.nextInt();
			System.out.println("Enter the operator; +, -, *, /: ");
			operand = input.next().charAt(0);

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
            }
		}
	}
}	