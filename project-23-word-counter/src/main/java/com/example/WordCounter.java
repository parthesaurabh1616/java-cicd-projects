package com.example;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("📝 Word Counter");
        System.out.print("Enter a sentence or paragraph: ");
        String input = scanner.nextLine();

        int wordCount = input.trim().isEmpty() ? 0 : input.trim().split("\\s+").length;
        int charCount = input.replaceAll("\\s+", "").length();
        int spaceCount = input.length() - input.replace(" ", "").length();

        System.out.println("📊 Results:");
        System.out.println("Words: " + wordCount);
        System.out.println("Characters (excluding spaces): " + charCount);
        System.out.println("Spaces: " + spaceCount);

        scanner.close();
    }
}