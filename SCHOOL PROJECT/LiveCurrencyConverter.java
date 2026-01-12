import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class LiveCurrencyConverter {

    
    private static final String API_KEY = "08887998278e6b96f0c4e316";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Live Currency Converter (Real-Time Rates) ---");

        while (true) {
            System.out.print("\nEnter amount in USD (or 0 to exit): ");
            double amount = sc.nextDouble();
            if (amount == 0) break;

            System.out.println("Target Currency (EUR, GBP, NGN, INR): ");
            String target = sc.next().toUpperCase();

            try {
                double rate = getLiveRate(target);
                if (rate != -1) {
                    double result = amount * rate;
                    System.out.printf("LIVE RATE: 1 USD = %.2f %s\n", rate, target);
                    System.out.printf("RESULT: %.2f USD = %.2f %s\n", amount, result, target);
                } else {
                    System.out.println("Error: Could not find rate for " + target);
                }
            } catch (Exception e) {
                System.out.println("Connection Error: Check your internet or API Key.");
            }
        }
        sc.close();
    }

    /**
     * Fetches the live exchange rate from the API
     */
    public static double getLiveRate(String targetCurrency) throws Exception {
        String urlString = BASE_URL + API_KEY + "/latest/USD";
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlString))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();

        // Simple manual parsing of the JSON response to avoid needing external libraries
        // We look for the "targetCurrency": value pair in the text
        String searchString = "\"" + targetCurrency + "\":";
        if (body.contains(searchString)) {
            int startIndex = body.indexOf(searchString) + searchString.length();
            int endIndex = body.indexOf(",", startIndex);
            if (endIndex == -1) endIndex = body.indexOf("}", startIndex); // Handle last item
            
            String rateString = body.substring(startIndex, endIndex);
            return Double.parseDouble(rateString);
        }
        
        return -1;
    }
}