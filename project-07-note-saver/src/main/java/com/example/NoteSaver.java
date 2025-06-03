package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NoteSaver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter note title: ");
        String title = scanner.nextLine();

        System.out.println("Enter note body (end with a single line 'END'):");
        StringBuilder body = new StringBuilder();
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("END")) break;
            body.append(line).append(System.lineSeparator());
        }

        try (FileWriter writer = new FileWriter(title + ".txt")) {
            writer.write("Title: " + title + System.lineSeparator());
            writer.write("Body:" + System.lineSeparator());
            writer.write(body.toString());
            System.out.println("Note saved as " + title + ".txt");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the note.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
