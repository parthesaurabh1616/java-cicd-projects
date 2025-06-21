package com.example;

import java.util.Scanner;

public class InterestCalculator {

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time in years: ");
        double time = scanner.nextDouble();

        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.printf("Simple Interest = ₹%.2f\n", interest);

        scanner.close();
    }
}