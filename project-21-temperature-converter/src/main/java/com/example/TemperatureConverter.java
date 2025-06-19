package com.example;

import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🌡️ Temperature Converter");
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();

        double result;
        switch (choice) {
            case 1 -> {
                result = celsiusToFahrenheit(value);
                System.out.printf("Result: %.2f °F\n", result);
            }
            case 2 -> {
                result = fahrenheitToCelsius(value);
                System.out.printf("Result: %.2f °C\n", result);
            }
            case 3 -> {
                result = celsiusToKelvin(value);
                System.out.printf("Result: %.2f K\n", result);
            }
            case 4 -> {
                result = kelvinToCelsius(value);
                System.out.printf("Result: %.2f °C\n", result);
            }
            default -> System.out.println("❌ Invalid choice.");
        }

        scanner.close();
    }
}