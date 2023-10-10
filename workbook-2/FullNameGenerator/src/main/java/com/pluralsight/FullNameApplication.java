package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ask the user to enter parts of their name
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your middle name or press Enter to skip): ");
        String middleName = scanner.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Please enter your suffix or press Enter to skip): ");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }
        fullName += " " + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;


            //Print full name
            System.out.println("Fullname: " + fullName);

            scanner.close();
        }


    }
}
