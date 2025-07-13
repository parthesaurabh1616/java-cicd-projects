package com.example;

import java.util.Scanner;

public class VowelConsonantCounter {

    public static void countLetters(String input) {
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("✅ Vowels: " + vowels);
        System.out.println("✅ Consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String line = scanner.nextLine();

        countLetters(line);

        scanner.close();
    }
}