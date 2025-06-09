package com.example;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = false;
        long startTime = 0;
        long elapsedTime = 0;

        while (true) {
            System.out.println("\\nOptions: start | stop | reset | exit");
            System.out.print("Enter command: ");
            String command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "start":
                    if (!running) {
                        startTime = System.currentTimeMillis();
                        running = true;
                        System.out.println("Stopwatch started.");
                    } else {
                        System.out.println("Stopwatch already running.");
                    }
                    break;
                case "stop":
                    if (running) {
                        elapsedTime += System.currentTimeMillis() - startTime;
                        running = false;
                        System.out.printf("Stopped. Elapsed time: %.2f seconds%n", elapsedTime / 1000.0);
                    } else {
                        System.out.println("Stopwatch is not running.");
                    }
                    break;
                case "reset":
                    running = false;
                    elapsedTime = 0;
                    System.out.println("Stopwatch reset.");
                    break;
                case "exit":
                    System.out.println("Exiting stopwatch.");
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}
