package com.example;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // 1 to 100
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("?? Correct! You guessed it in " + attempts + " attempts.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("?? Try higher!");
            } else {
                System.out.println("?? Try lower!");
            }
        }

        scanner.close();
    }
}
