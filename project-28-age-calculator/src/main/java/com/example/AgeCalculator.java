package com.example;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        try {
            LocalDate birthDate = LocalDate.parse(input);
            LocalDate currentDate = LocalDate.now();

            if (birthDate.isAfter(currentDate)) {
                System.out.println("❌ Birthdate cannot be in the future.");
                return;
            }

            Period age = Period.between(birthDate, currentDate);

            System.out.printf("✅ You are %d years, %d months, %d days old.%n",
                age.getYears(), age.getMonths(), age.getDays());

        } catch (DateTimeParseException e) {
            System.out.println("❌ Invalid date format. Please use yyyy-mm-dd.");
        } finally {
            scanner.close();
        }
    }
}