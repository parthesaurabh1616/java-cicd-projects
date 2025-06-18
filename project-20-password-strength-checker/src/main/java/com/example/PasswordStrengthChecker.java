package com.example;

import java.util.Scanner;

public class PasswordStrengthChecker {

    public static String checkStrength(String password) {
        int strength = 0;

        if (password.length() >= 8) strength++;
        if (password.matches(".*[A-Z].*")) strength++;
        if (password.matches(".*[0-9].*")) strength++;
        if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) strength++;

        return switch (strength) {
            case 4 -> "💪 Strong";
            case 3 -> "🙂 Medium";
            default -> "⚠️ Weak";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password to evaluate its strength: ");
        String password = scanner.nextLine();

        String result = checkStrength(password);
        System.out.println("Password Strength: " + result);

        scanner.close();
    }
}