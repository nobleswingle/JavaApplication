import java.util.Scanner;
public class UsingEnums {
	public enum AccountType{
		SAVINGS,
		CURRENT,
		FIXED_DEPOSIT
	}
	public static void main(String[] args) {
		Scanner saving = new Scanner(System.in);
		System.out.println("");
		
		System.out.println("Enter Account type (SAVINGS, CURRENT OR FIXED_DEPOSIT): ");
		System.out.println("");
		
		System.out.println("Please enter account type: ");
		String userChoice = saving.nextLine().toUpperCase();
				
		AccountType selectedType = null;
		
		if(userChoice.equals("SAVINGS")) {
			selectedType = AccountType.SAVINGS;
			System.out.println("Your account was created "); 
		}
		else if(userChoice.equals("CURRENT")) {
			selectedType = AccountType.CURRENT;
			System.out.println("Account created sucessfully "); 
		}
		else if(userChoice.equals("FIXED_DEPOSIT")) {
			selectedType = AccountType.FIXED_DEPOSIT;
			System.out.println("Sucessfully created an account "); 
		}
		
		if(selectedType != null) {
			System.out.println("Selected account type is " + selectedType);
		}
   
        else{
		System.out.println("Invalid Account type ");
		}
	}
}
				
			
		