package com.example;

import java.util.Scanner;

public class StringReverser {

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String reversed = reverse(input);
        System.out.println("✅ Reversed string: " + reversed);

        scanner.close();
    }
}