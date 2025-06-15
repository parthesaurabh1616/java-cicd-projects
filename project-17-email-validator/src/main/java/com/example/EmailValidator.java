package com.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address to validate: ");
        String email = scanner.nextLine();

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        boolean isValid = Pattern.matches(emailRegex, email);

        if (isValid) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is NOT a valid email address.");
        }
    }
}
