package com.example;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("Supported conversions:");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. EUR to INR");
        System.out.println("4. INR to EUR");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double result = 0.0;
        switch (choice) {
            case 1:
                result = amount * 83.0; // Example: 1 USD = 83 INR
                System.out.printf("USD %.2f = INR %.2f\n", amount, result);
                break;
            case 2:
                result = amount / 83.0;
                System.out.printf("INR %.2f = USD %.2f\n", amount, result);
                break;
            case 3:
                result = amount * 90.0; // Example: 1 EUR = 90 INR
                System.out.printf("EUR %.2f = INR %.2f\n", amount, result);
                break;
            case 4:
                result = amount / 90.0;
                System.out.printf("INR %.2f = EUR %.2f\n", amount, result);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
