import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private static Map<String, Double> exchangeRates = new HashMap<>();

    static {
        // Add exchange rates here
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.72);
        exchangeRates.put("JPY", 109.86);
        exchangeRates.put("INR", 73.41); // Indian Rupee (INR) exchange rate
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.println("Available currencies: USD, EUR, GBP, JPY, INR");

        while (true) {
            System.out.print("Enter the amount to convert (or 0 to quit): ");
            double amount = scanner.nextDouble();
            if (amount == 0) {
                break;
            }

            System.out.print("Enter the source currency (USD, EUR, GBP, JPY, INR): ");
            String sourceCurrency = scanner.next().toUpperCase();

            if (!exchangeRates.containsKey(sourceCurrency)) {
                System.out.println("Invalid currency.");
                continue;
            }

            System.out.print("Enter the target currency (USD, EUR, GBP, JPY, INR): ");
            String targetCurrency = scanner.next().toUpperCase();

            if (!exchangeRates.containsKey(targetCurrency)) {
                System.out.println("Invalid currency.");
                continue;
            }

            double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);
            System.out.println(
                    amount + " " + sourceCurrency + " is equivalent to " + convertedAmount + " " + targetCurrency);
        }

        System.out.println("Thank you for using Currency Converter!");
        scanner.close();
    }

    private static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        double sourceRate = exchangeRates.get(sourceCurrency);
        double targetRate = exchangeRates.get(targetCurrency);

        return amount * (targetRate / sourceRate);
    }
}
