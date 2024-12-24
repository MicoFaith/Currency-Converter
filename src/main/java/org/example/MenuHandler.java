package org.example;

import java.util.Scanner;

public class MenuHandler {
    private final CurrencyConverter converter;
    private final Scanner scanner;

    public MenuHandler(CurrencyConverter converter) {
        this.converter = converter;
        this.scanner = new Scanner(System.in);
    }

    public void showMainMenu() {
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Convert Currency");
            System.out.println("2. Update Exchange Rates");
            System.out.println("3. View Exchange Rates");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> handleCurrencyConversion();
                case 2 -> updateExchangeRates();
                case 3 -> viewExchangeRates();
                case 4 -> exitApp();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void handleCurrencyConversion() {
        System.out.print("Enter currency pair (e.g., USD_TO_INR): ");
        String fromTo = scanner.next();
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        try {
            double convertedAmount = converter.convert(fromTo, amount);
            System.out.printf("Converted Amount: %.2f%n", convertedAmount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void updateExchangeRates() {
        System.out.print("Enter currency pair to update (e.g., USD_TO_INR): ");
        String fromTo = scanner.next();
        System.out.print("Enter the new exchange rate: ");
        double rate = scanner.nextDouble();

        converter.updateExchangeRate(fromTo, rate);
        System.out.println("Exchange rate updated successfully.");
    }

    private void viewExchangeRates() {
        System.out.println("Current Exchange Rates:");
        converter.getExchangeRates().forEach((key, value) ->
                System.out.printf("%s: %.2f%n", key, value));
    }

    private void exitApp() {
        System.out.println("Thank you for using the Currency Converter App. Goodbye!");
        System.exit(0);
    }
}
