package com.example;

import java.util.Scanner;

public class DigitSum {

    public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number); // handle negative numbers

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int result = sumOfDigits(num);
        System.out.println("✅ Sum of digits: " + result);

        scanner.close();
    }
}