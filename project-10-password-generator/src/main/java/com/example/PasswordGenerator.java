package com.example;

import java.util.*;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password Generator");

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        System.out.print("Include uppercase letters? (true/false): ");
        boolean includeUppercase = scanner.nextBoolean();

        System.out.print("Include lowercase letters? (true/false): ");
        boolean includeLowercase = scanner.nextBoolean();

        System.out.print("Include digits? (true/false): ");
        boolean includeDigits = scanner.nextBoolean();

        System.out.print("Include special characters? (true/false): ");
        boolean includeSpecial = scanner.nextBoolean();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*()-_=+<>?";

        String charPool = "";
        if (includeUppercase) charPool += upper;
        if (includeLowercase) charPool += lower;
        if (includeDigits) charPool += digits;
        if (includeSpecial) charPool += special;

        if (charPool.isEmpty()) {
            System.out.println("No character types selected. Exiting.");
            return;
        }

        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }

        System.out.println("Generated Password: " + password.toString());
    }
}
