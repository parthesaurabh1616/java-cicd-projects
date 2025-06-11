package com.example;

import java.util.Scanner;

public class LoanEMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount (principal): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan tenure (in years): ");
        int tenureYears = scanner.nextInt();

        double monthlyRate = annualInterestRate / (12 * 100); // monthly interest rate
        int numberOfMonths = tenureYears * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths)) /
                     (Math.pow(1 + monthlyRate, numberOfMonths) - 1);

        System.out.printf("Your monthly EMI is: ?%.2f\n", emi);
    }
}
