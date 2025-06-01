package com.example;

import java.util.Scanner;

public class MiniQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Mini Quiz!");
        System.out.println("--------------------------");

        System.out.println("Q1: What is the capital of France?");
        System.out.print("Your answer: ");
        String ans1 = scanner.nextLine();
        if (ans1.equalsIgnoreCase("Paris")) {
            score++;
        }

        System.out.println("Q2: 5 + 7 = ?");
        System.out.print("Your answer: ");
        int ans2 = scanner.nextInt();
        if (ans2 == 12) {
            score++;
        }

        scanner.nextLine(); // Clear the buffer

        System.out.println("Q3: Which language runs on the JVM?");
        System.out.print("Your answer: ");
        String ans3 = scanner.nextLine();
        if (ans3.equalsIgnoreCase("Java")) {
            score++;
        }

        System.out.println("\nYour score: " + score + "/3");
        scanner.close();
    }
}
