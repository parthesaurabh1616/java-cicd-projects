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
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println("✅ " + num + " is a prime number.");
        } else {
            System.out.println("❌ " + num + " is not a prime number.");
        }

        scanner.close();
    }
}