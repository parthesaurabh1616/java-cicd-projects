package com.example;

import java.util.*;

public class PasswordGenerator {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+[]{}|;:',.<>?/~";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder characterPool = new StringBuilder();

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        System.out.print("Include uppercase letters? (yes/no): ");
        if (scanner.next().equalsIgnoreCase("yes")) characterPool.append(UPPER);

        System.out.print("Include lowercase letters? (yes/no): ");
        if (scanner.next().equalsIgnoreCase("yes")) characterPool.append(LOWER);

        System.out.print("Include numbers? (yes/no): ");
        if (scanner.next().equalsIgnoreCase("yes")) characterPool.append(NUMBERS);

        System.out.print("Include symbols? (yes/no): ");
        if (scanner.next().equalsIgnoreCase("yes")) characterPool.append(SYMBOLS);

        if (characterPool.length() == 0) {
            System.out.println("No character sets selected. Cannot generate password.");
            return;
        }

        String password = generatePassword(length, characterPool.toString());
        System.out.println("Generated Password: " + password);
    }

    private static String generatePassword(int length, String characters) {
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }
        return password.toString();
    }
}
