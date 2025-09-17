package edu.ccrm.cli;

import java.util.Scanner;

public class CliManager {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to Campus Course & Records Manager (CCRM)");

        do {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Courses");
            System.out.println("3. Manage Enrollments & Grades");
            System.out.println("4. File Operations");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = -1;
            try {
                choice = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("ERROR: Invalid input. Please enter a number.");
            } finally {
                scanner.nextLine(); // Consume the rest of the line
            }

            switch (choice) {
                case 1:
                    System.out.println("\n-> Student management subsystem...");
                    // TODO: Call a method to handle student operations
                    break;
                case 2:
                    System.out.println("\n-> Course management subsystem...");
                    // TODO: Call a method to handle course operations
                    break;
                case 3:
                    System.out.println("\n-> Enrollment subsystem...");
                     // TODO: Call a method to handle enrollment
                    break;
                case 4:
                    System.out.println("\n-> File operations subsystem...");
                     // TODO: Call a method to handle file operations
                    break;
                case 0:
                    exit = true;
                    System.out.println("Thank you for using CCRM. Goodbye!");
                    break;
                default:
                    if (choice != -1) {
                         System.out.println("Invalid choice. Please try again.");
                    }
            }
        } while (!exit);

        scanner.close();
    }
}