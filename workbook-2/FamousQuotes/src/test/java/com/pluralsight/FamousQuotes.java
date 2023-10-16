package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes = {
                "Walk slowly, but don't stop.",
                "To iterate is human, to recurse divine.",
                "The best error message is the one that never shows up.",
                "Code like a butterfly, test like a bee.",
                "Simplicity is the soul of efficiency.",
                "The road to success is always under construction.",
                "The only constant in the universe is change.",
                "Debugging is like being the detective in a crime movie where you are also the murderer.",
                "When one teaches, two learn.",
                "Do or do not, there is no try."
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean continueShowingQuotes = true;

            while (continueShowingQuotes) {
                try {
                    System.out.println("Please enter a number between 1 and 10 to display a quote, or 0 for a random quote:");
                    int userInput = scanner.nextInt();

                    if (userInput >= 1 && userInput <= 10) {
                        // Display the selected quote
                        System.out.println(quotes[userInput - 1]);
                    } else if (userInput == 0) {
                        // Display a random quote
                        int randomIndex = random.nextInt(quotes.length);
                        System.out.println(quotes[randomIndex]);
                    } else {
                        // Handle the case when the user enters an invalid number
                        System.out.println("Invalid input. Please enter a number between 1 and 10 or 0 for a random quote.");
                    }
                } catch (java.util.InputMismatchException e) {
                    // Handle non-integer input
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Consume the invalid input to avoid an infinite loop
                }

                // Ask the user if they want to see another quote
                System.out.println("Do you want to see another saying? (yes/no)");
                String response = scanner.next().toLowerCase();

                if (!response.equals("yes")) {
                    continueShowingQuotes = false;
                }
            }

            System.out.println("Goodbye!");
            scanner.close();



            }
        }

