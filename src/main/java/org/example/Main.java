package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        MenuHandler menuHandler = new MenuHandler(converter);

        System.out.println("Welcome to the Currency Converter App!");
        menuHandler.showMainMenu();
    }
}
