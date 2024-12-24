package org.example;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private final Map<String, Double> exchangeRates = new HashMap<>();

    public CurrencyConverter() {
        // Initialize with some sample exchange rates
        exchangeRates.put("USD_TO_INR", 82.75);
        exchangeRates.put("EUR_TO_INR", 88.50);
        exchangeRates.put("GBP_TO_INR", 102.30);
    }

    public double convert(String fromTo, double amount) {
        if (!exchangeRates.containsKey(fromTo)) {
            throw new IllegalArgumentException("Invalid currency pair: " + fromTo);
        }
        return amount * exchangeRates.get(fromTo);
    }

    public void updateExchangeRate(String fromTo, double rate) {
        exchangeRates.put(fromTo, rate);
    }

    public Map<String, Double> getExchangeRates() {
        return exchangeRates;
    }
}
