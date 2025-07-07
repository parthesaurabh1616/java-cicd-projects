package com.example;

import java.util.Scanner;

public class ArmstrongChecker {

    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();

        if (isArmstrong(num)) {
            System.out.println("✅ " + num + " is an Armstrong number.");
        } else {
            System.out.println("❌ " + num + " is not an Armstrong number.");
        }

        scanner.close();
    }
}