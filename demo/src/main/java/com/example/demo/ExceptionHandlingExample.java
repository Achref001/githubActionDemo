package com.example.demo;
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String userInput = scanner.next();

        // Incorrect: No exception handling
        int number = Integer.parseInt(userInput);

        System.out.println("You entered: " + number);

        // Close the scanner (mistake here)
        scanner.close();
    }
}