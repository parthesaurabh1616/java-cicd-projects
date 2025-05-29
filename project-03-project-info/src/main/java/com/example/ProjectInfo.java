package com.example;

public class ProjectInfo {
    public static final String PROJECT_NAME = "Project Info Printer";
    public static final String AUTHOR = "Your Name";
    public static final String VERSION = "1.0";
    public static final String DESCRIPTION = "Prints basic project metadata.";

    public static void main(String[] args) {
        System.out.println("Project: " + PROJECT_NAME);
        System.out.println("Author: " + AUTHOR);
        System.out.println("Version: " + VERSION);
        System.out.println("Description: " + DESCRIPTION);
    }
}
