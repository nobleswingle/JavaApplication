import java.util.Scanner;

public class SimpleConsoleCalculator{
	public static void main(String[] args){
		// this will create a scanner object that accepts input from the user
		
		Scanner scanner = new Scanner(System.in);
		
		// Prompt 1. user for first number 
		System.out.println("Enter the first number: ");
		double num1 = scanner.nextDouble(); // this will read the first number
		
		// Prompt2. user for the operation
		System.out.println("Enter the operation (+, -, *, /): "); // read the operation as a string, then get the first character
		char operator = scanner.next().charAt(0);
		
		// Prompt3. user for the second number 
		System.out.println("Enter the second number: ");
		double num2 = scanner.nextDouble(); // Read the second number
		
		// Prompt4. Initialize a variable to hold the result
		double result = 0.0;
		
		//Prompt5. We will use a switch case statement to perform the calculation here 
		//(it will complete this in Step2)
		switch (operator) {
			case '+':
			result = num1 + num2;
			break;
			
			case '-':
			result = num1 - num2;
			break;
			
			case '*':
			result = num1 * num2;
			break;
			
			case '/':
			if (num2 == 0) {
				System.out.println("Error: cannot divide by zero. ");
				scanner.close(); // close the scanner
				return;         //exit the main method
			}
			result = num1 / num2;
			break;
			default:
			System.out.println("Error: Invalid Operator. ");
			scanner.close(); 
			return;
		}
		
		
		//Prompt6. Display the result 
		System.out.println("Result: " + num1 + " " + operator +""+num2 + " = " + result);
		
		//Prompt 7. Close the scanner object
		scanner.close();
		
		

	}
}