package com.example;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence or paragraph:");
        String input = scanner.nextLine();

        // Word count
        String[] words = input.trim().split("\\s+");
        int wordCount = input.trim().isEmpty() ? 0 : words.length;

        // Character count (excluding spaces)
        int charCount = input.replaceAll("\\s+", "").length();

        // Sentence count
        int sentenceCount = input.split("[.!?]+").length;

        System.out.println("✅ Word count: " + wordCount);
        System.out.println("✅ Character count (excluding spaces): " + charCount);
        System.out.println("✅ Sentence count: " + sentenceCount);

        scanner.close();
    }
}