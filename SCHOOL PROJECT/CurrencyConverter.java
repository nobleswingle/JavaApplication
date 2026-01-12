import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // 1. Define exchange rates
        double usdToEur = 0.92;
        double usdToGbp = 0.79;
        double usdToInr = 83.30;
        double usdToNgn = 1650.00; 

        System.out.println(" ------------------- Currency Converter -------------------- ");

        // 2. Get the amount from the user
        System.out.print("Enter the amount in USD: ");
        double amount = reader.nextDouble();

        // 3. Display Menu
        System.out.println("\nChoose the target currency:");
        System.out.println("1. Euro (EUR)");
        System.out.println("2. British Pound (GBP)");
        System.out.println("3. Indian Rupee (INR)");
        System.out.println("4. Nigerian Naira (NGN)"); 
        System.out.print("Enter choice (1-4): ");
        int choice = reader.nextInt();

        double convertedAmount = 0;
        String currencyName = "";

        // 4. Logic using Switch (Cleaner for menus!)
        switch (choice) {
            case 1:
                convertedAmount = amount * usdToEur;
                currencyName = "EUR";
                break;
            case 2:
                convertedAmount = amount * usdToGbp;
                currencyName = "GBP";
                break;
            case 3:
                convertedAmount = amount * usdToInr;
                currencyName = "INR";
                break;
            case 4:
                convertedAmount = amount * usdToNgn;
                currencyName = "NGN";
                break;
            default:
                System.out.println("Error: Invalid choice!");
                return; // Ends the program if choice is wrong
        }

        // 5. Output the result
        // Using printf to format to 2 decimal places (like real money)
        System.out.printf("\nResult: %.2f USD = %.2f %s%n", amount, convertedAmount, currencyName);
        
        System.out.println("Calculation complete.");
        reader.close();
    }
}