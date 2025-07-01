package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    private static final Map<String, Double> rates = new HashMap<>();

    static {
        rates.put("INR-USD", 0.012);
        rates.put("USD-INR", 83.0);
        rates.put("EUR-INR", 90.0);
        rates.put("INR-EUR", 0.011);
        rates.put("USD-EUR", 0.93);
        rates.put("EUR-USD", 1.08);
    }

    public static double convert(double amount, String from, String to) {
        String key = from.toUpperCase() + "-" + to.toUpperCase();
        if (rates.containsKey(key)) {
            return amount * rates.get(key);
        } else {
            System.out.println("❌ Conversion rate not available.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("From currency (INR/USD/EUR): ");
        String from = scanner.nextLine().trim().toUpperCase();

        System.out.print("To currency (INR/USD/EUR): ");
        String to = scanner.nextLine().trim().toUpperCase();

        double result = convert(amount, from, to);

        if (result >= 0) {
            System.out.printf("✅ Converted amount: %.2f %s\n", result, to);
        }

        scanner.close();
    }
}