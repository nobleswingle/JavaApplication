import java.util.Random;

public class AccountNumber {
	public static void main(String[] args) {
	System.out.printf("Generated AccountNumber is %s%n",generateAccountNumber());
	}
    public static String generateAccountNumber() {
		Random rand = new Random();
		String number = "";
		
		for(int i = 1; i < 10; i++) {
			int digit = rand.nextInt(10);
			number += digit;
		}
		return number;
	}
}