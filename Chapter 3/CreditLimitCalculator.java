import java.util.Scanner;

public class CreditLimitCalculator{
	public static void main(String[] args){
		String accountNumber= "8134385814";
		int beginningBalance=1000;
		int charges=10;
		int credits=0;
		int totalCredits =0;
		int totalCharges =0;
		int creditLimit=100000;
		float newBalance= 0;
		
		Scanner input = new Scanner(System.in);

		while (credits != -1){
			System.out.println("Input -1 to end");
			System.out.print("Enter Credit amount: ");
			credits = input.nextInt();
			newBalance=(float)beginningBalance-totalCharges+totalCredits;

			
			if (newBalance>creditLimit){
				System.out.println("Credit limit exceeded.");
				totalCredits-=credits;
				break;
			}
			if (credits == -1){
				break;
			}
			totalCredits+=credits;
			totalCharges+=charges;
			
			
		}
		System.out.printf("Total Credits = %d%nTotal Charges = %d%nNew balance = %.2f%n",totalCredits,totalCharges,newBalance);
	}
}