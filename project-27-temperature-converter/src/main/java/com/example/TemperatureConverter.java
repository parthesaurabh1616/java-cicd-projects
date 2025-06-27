package com.example;

import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    public static double fahrenheitToKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToFahrenheit(double k) {
        return (k - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter 🌡️");
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");

        System.out.print("Enter option (1–6): ");
        int option = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        double result = 0;
        switch (option) {
            case 1: result = celsiusToFahrenheit(temp); break;
            case 2: result = fahrenheitToCelsius(temp); break;
            case 3: result = celsiusToKelvin(temp); break;
            case 4: result = kelvinToCelsius(temp); break;
            case 5: result = fahrenheitToKelvin(temp); break;
            case 6: result = kelvinToFahrenheit(temp); break;
            default: System.out.println("❌ Invalid option!"); return;
        }

        System.out.printf("✅ Converted Temperature: %.2f\n", result);
        scanner.close();
    }
}