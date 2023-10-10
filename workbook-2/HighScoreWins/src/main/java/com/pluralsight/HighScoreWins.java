package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter a game score: ");
            String input = scanner.nextLine();

            // Split the input string by the pipe character (|)
            String[] parts = input.split("\\|");

            if (parts.length == 2) {
                String[] teamScores = parts[1].split(":");

                if (teamScores.length == 2) {
                    String homeTeam = parts[0].split(":")[0].trim();
                    String visitorTeam = parts[0].split(":")[1].trim();
                    int homeScore = Integer.parseInt(teamScores[0].trim());
                    int visitorScore = Integer.parseInt(teamScores[1].trim());

                    if (homeScore > visitorScore) {
                        System.out.println("Winner: " + homeTeam);
                    } else if (homeScore < visitorScore) {
                        System.out.println("Winner: " + visitorTeam);
                    } else {
                        System.out.println("It's a tie!");
                    }
                } else {
                    System.out.println("Invalid score format.");
                }
            } else {
                System.out.println("Invalid input format.");
            }

            scanner.close();
        }
    }

