package com.example;

import java.util.Scanner;

public class FactorialCalculator {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("❌ Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(num);
            System.out.printf("✅ Factorial of %d is: %d\n", num, result);
        }

        scanner.close();
    }
}