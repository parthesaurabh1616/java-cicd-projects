package com.example;

import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int input = scanner.nextInt();

        if (isPrime(input)) {
            System.out.println("✅ " + input + " is a prime number.");
        } else {
            System.out.println("❌ " + input + " is not a prime number.");
        }

        scanner.close();
    }
}