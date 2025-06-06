package com.example;

import java.util.Scanner;

public class UnitConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Unit Converter");
            System.out.println("1. Kilometers to Miles");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Celsius to Fahrenheit");
            System.out.println("4. Fahrenheit to Celsius");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            double input, result;
            switch (choice) {
                case 1:
                    System.out.print("Enter kilometers: ");
                    input = scanner.nextDouble();
                    result = input * 0.621371;
                    System.out.println(input + " km = " + result + " miles");
                    break;
                case 2:
                    System.out.print("Enter miles: ");
                    input = scanner.nextDouble();
                    result = input / 0.621371;
                    System.out.println(input + " miles = " + result + " km");
                    break;
                case 3:
                    System.out.print("Enter Celsius: ");
                    input = scanner.nextDouble();
                    result = (input * 9/5) + 32;
                    System.out.println(input + " °C = " + result + " °F");
                    break;
                case 4:
                    System.out.print("Enter Fahrenheit: ");
                    input = scanner.nextDouble();
                    result = (input - 32) * 5/9;
                    System.out.println(input + " °F = " + result + " °C");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println();
        } while (choice != 5);

        scanner.close();
    }
}
