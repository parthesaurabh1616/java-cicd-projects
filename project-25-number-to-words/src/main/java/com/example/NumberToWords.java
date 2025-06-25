package com.example;

import java.util.Scanner;

public class NumberToWords {

    private static final String[] units = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convert(int number) {
        if (number == 0) return "Zero";

        if (number < 0 || number > 9999)
            return "Number out of range (0–9999)";

        StringBuilder words = new StringBuilder();

        if (number / 1000 > 0) {
            words.append(units[number / 1000]).append(" Thousand ");
            number %= 1000;
        }

        if (number / 100 > 0) {
            words.append(units[number / 100]).append(" Hundred ");
            number %= 100;
        }

        if (number > 0) {
            if (number < 20) {
                words.append(units[number]);
            } else {
                words.append(tens[number / 10]).append(" ");
                words.append(units[number % 10]);
            }
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0–9999): ");
        int number = scanner.nextInt();

        String result = convert(number);
        System.out.println("In words: " + result);
        scanner.close();
    }
}