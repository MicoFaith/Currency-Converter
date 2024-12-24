package org.example;

public class ExchangeRateUpdater {
    public static void autoUpdate(CurrencyConverter converter) {
        // Example of dynamically updating rates
        converter.updateExchangeRate("USD_TO_INR", 83.10); // Simulating updated rate
        converter.updateExchangeRate("EUR_TO_INR", 89.00);
    }
}
