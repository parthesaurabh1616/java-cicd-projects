package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to write to file (type 'exit' to finish):");

        try (FileWriter writer = new FileWriter("output.txt")) {
            while (true) {
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(line + System.lineSeparator());
            }
            System.out.println("Text written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
